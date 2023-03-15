package atividade_08_heranca_polimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		List<Product> listProducts = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int products = sc.nextInt();
		
		for(int i = 1; i <= products; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char carac = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(carac == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				Product importedeProduct = new ImportedProduct(name, price, customsFee);
				listProducts.add(importedeProduct);
			}
			else if (carac == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				Product usedProduct = new UsedProduct(name, price, date);
				listProducts.add(usedProduct);
			}
			else {
				Product product = new Product(name, price);
				listProducts.add(product);
			}
			
		}
		System.out.println();
		System.out.println("Price tags:");
		for (Product product : listProducts) {
			System.out.println(product.priceTag());
		}
		
	}

}
