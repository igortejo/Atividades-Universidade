import java.util.Arrays;
import java.util.Scanner;

class InsertionSortRecursivo {

	public static void main(String[] args) {

		
		System.out.println(Arrays.toString((InsertionSort(transformaArray()))));
	}
	
	public static int[] transformaArray() {
		Scanner sc = new Scanner(System.in);

		String[] temp = sc.nextLine().split(" ");
		int[] num = new int[temp.length];
		
		for (int i = 0; i < num.length; i++) {
			
			num[i] = Integer.parseInt(temp[i]);
			}
		return num;
		
	}
	
	public static int[] InsertionSort(int[] num) {

		for (int i = 1; i < num.length; i++) { 
			
			int j = i;
		
			while (j >= 0 && num[j] < num[j-1]) {
				int aux = num[j];
				num[j] = num[j - 1];
				num[j - 1] = aux;
				j -= 1;
			}
		
		}
		return num;		
	}		
}
