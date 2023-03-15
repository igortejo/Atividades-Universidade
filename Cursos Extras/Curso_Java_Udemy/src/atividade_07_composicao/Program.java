package atividade_07_composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY"); 
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");		
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		System.out.print("How many items to this order?: ");
		int itens = sc.nextInt();
		Order order = new Order(new Date(), status, client);		

		
		for (int i = 1; i <= itens; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			Product product = new Product(name, price);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			OrderItem item = new OrderItem(quantity, price, product);
			order.addItem(item);
			
		}
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);



		
	}

}
