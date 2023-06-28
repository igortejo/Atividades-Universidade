package sorting.divideAndConquer;
import sorting.AbstractSorting;

public class Main {

	public static void main(String[] args) {
		
		Integer[] array = {5,4,3,2,1};

		
		//MergeSort<Integer> merge = new MergeSort<>();
		QuickSort<Integer> quick = new QuickSort<>();

		
		quick.sort(array, 0, 4);
		
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1) {
				System.out.print(array[i] + ", ");

			}else {
				System.out.print(array[i]);

			}

		}
		

	}

}
