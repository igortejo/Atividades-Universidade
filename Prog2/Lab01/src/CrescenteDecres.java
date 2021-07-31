import java.util.Scanner;

public class CrescenteDecres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int valor3 = sc.nextInt();
		int valor4 = sc.nextInt();
		if (valor4 > valor3 && valor3 > valor2 && valor2 > valor1) {
			System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
		}else if(valor4 < valor3 && valor3 < valor2 && valor2 < valor1){
			System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
		}else {
			System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
		}
	}

}
