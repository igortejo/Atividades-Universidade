package GUI;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ControleText extends JFrame {    // tirei o implements ActionListener desse classe pois ela
											  // nao trata mais os botoes, sao classes especiliazadas agora
  	
	/*
	 * Precisam ser atributos da classe (serem declarado fora) 
	 * para que os metodos listener tenham acesso a eles.
	 */
	JButton ok;
	JButton cancel;
	JTextField login;
	JPasswordField senha;

	public ControleText() {
		super("Textos e senhas");
		
		ok = new JButton("OK");
		ok.addActionListener(new BotaoOKListener());  //vinculando o botao ao metodo listener
		
		cancel = new JButton("Cancel");
		cancel.addActionListener(new BotaoCancelListener());  //vinculando o botao ao metodo listener
															  // se fosse essa mesma classe (ControleText) que tivesse tratando
															  // os botoes, ficaria this no lugar de new BotaoCancelListener()
		
		login = new JTextField();
		senha = new JPasswordField();
		
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,2));
		c.add(new JLabel("Login"));
		c.add(login);
		c.add(new JLabel("Senha"));
		c.add(senha);
		c.add(ok);
		c.add(cancel);
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new ControleText();

	}
	
	
	/*
	 * Criei essas duas classe para tratarem cada botao
	 */
	
	class BotaoOKListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = "Login: " + login.getText() + "\n" + "Senha: " + (new String(senha.getPassword()));
			JOptionPane.showMessageDialog(null, s);			
		}
		
	}
	
	class BotaoCancelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			login.setText("");
			senha.setText("");
		}
		
		
	}


		
	/*
	 * Se eu tivesse varios botoes, iam ter muitos if e elses abaixo,
	 * entao, criei as duas classe acima pra tratar cada botao (ficando uma programacao mais POO)
	 */
	
	//@Override
	//public void actionPerformed(ActionEvent e) {
		
	//	if (e.getSource() == ok) {  //e.getSource retorna o objeto que foi clicado
	//		String s = "Login: " + login.getText() + "\n" + "Senha: " + (new String(senha.getPassword()));
	//		JOptionPane.showMessageDialog(null, s);	
			
	//	}else if (e.getSource() == cancel) {   //se clicar em cancel quero que limpe os campos de senha e login
	//		login.setText("");
	//		senha.setText("");
	//	}
	//}

}
