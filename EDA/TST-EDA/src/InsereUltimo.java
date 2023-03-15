import java.util.Arrays;
import java.util.Scanner;

class InsereUltimo {

	public static void main(String[] args) {
		

		System.out.println(Arrays.toString(insereUltimo(transformaArray())));

	}

	public static int[] insereUltimo(int[] num) {
		int j = num.length - 1;

		while (j > 0 && num[j] < num[j - 1]) {

			int aux = num[j];
			num[j] = num[j - 1];
			num[j - 1] = aux;
			j -= 1;
		}
		return num;
	}

	public static int[] transformaArray() {
		Scanner sc = new Scanner(System.in);

		String[] temp = sc.nextLine().split(" ");

		int[] num = new int[temp.length];

		for (int i = 0; i < temp.length; i++) {
			num[i] = Integer.parseInt(temp[i]);
		}
		return num;
	}

}
