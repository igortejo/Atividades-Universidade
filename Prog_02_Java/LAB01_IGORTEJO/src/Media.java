import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double n1 = sc.nextFloat();
			double n2 = sc.nextFloat();
			double media = (n1 + n2)/2;
			if (media >= 7) {
				System.out.println("pass: True!");
			} else {
				System.out.println("pass: False!");
			}
			
	}

}
