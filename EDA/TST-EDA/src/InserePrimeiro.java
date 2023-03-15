import java.util.Arrays;
import java.util.Scanner;

class InserePrimeiro {
			
	public static void main(String[] args) {    //não dividi em métodos como fiz no insere ultimo
		
		Scanner sc = new Scanner(System.in);
		
		String[] num = sc.nextLine().split(" ");
		
		int j = 0;

		while (j < num.length-1 && Integer.parseInt(num[j]) > Integer.parseInt(num[j + 1])) {
	            String aux = num[j];
	            num[j] = num[j+1];
	            num[j+1] = aux;
	            j += 1;
	    }	
		
		System.out.println(Arrays.toString(num));
	}

}
