package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConversorTemperatura extends JFrame {

	private JPanel contentPane;
	private JTextField valor;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorTemperatura frame = new ConversorTemperatura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConversorTemperatura() {
		setFont(new Font("Dialog", Font.PLAIN, 35));
		setTitle("Conversor de Temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double fahrenheit = Double.parseDouble(valor.getText());
				double celsius = (fahrenheit - 32)/1.8;
				resultado.setText(celsius + "ºC");
				
			}
		});
		btnConverter.setFont(new Font("DejaVu Sans Light", Font.BOLD, 26));
		contentPane.add(btnConverter, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Fahrenheit:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 26));
		panel.add(lblNewLabel);
		
		valor = new JTextField();
		valor.setFont(new Font("Dialog", Font.PLAIN, 26));
		panel.add(valor);
		valor.setColumns(10);
		
		JLabel lblCelsius = new JLabel("Celsius:");
		lblCelsius.setHorizontalAlignment(SwingConstants.CENTER);
		lblCelsius.setFont(new Font("Dialog", Font.BOLD, 26));
		panel.add(lblCelsius);
		
		resultado = new JTextField();
		resultado.setFont(new Font("Dialog", Font.PLAIN, 26));
		panel.add(resultado);
		resultado.setColumns(10);
	}

}
