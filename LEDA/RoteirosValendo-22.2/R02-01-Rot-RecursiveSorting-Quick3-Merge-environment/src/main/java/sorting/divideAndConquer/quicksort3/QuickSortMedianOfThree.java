package sorting.divideAndConquer.quicksort3;

import java.util.Arrays;

import sorting.AbstractSorting;
import util.Util;

/**
 * A classe QuickSortMedianOfThree representa uma variação do QuickSort que
 * funciona de forma ligeiramente diferente. Relembre que quando o pivô
 * escolhido divide o array aproximadamente na metade, o QuickSort tem um
 * desempenho perto do ótimo. Para aproximar a entrada do caso ótimo, diversas
 * abordagens podem ser utilizadas. Uma delas é usar a mediana de 3 para achar o
 * pivô. Essa técnica consiste no seguinte:
 * 1. Comparar o elemento mais a esquerda, o central e o mais a direita do intervalo.
 * 2. Ordenar os elementos, tal que: A[left] < A[center] < A[right].
 * 3. Adotar o A[center] como pivô.
 * 4. Colocar o pivô na penúltima posição A[right-1].
 * 5. Aplicar o particionamento considerando o vetor menor, de A[left+1] até A[right-1].
 * 6. Aplicar o algoritmo na particao a esquerda e na particao a direita do pivô.
 */
public class QuickSortMedianOfThree<T extends Comparable<T>> extends
		AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		
		if(leftIndex <	 rightIndex) {
			
			int pivot_index = partition(array, leftIndex, rightIndex);
			sort(array, leftIndex, pivot_index - 1);
			sort(array, pivot_index + 1, rightIndex);
		}
		
	}
	
	public int pickPivotIndex (T[] array, int leftIndex, int rightIndex ) {
		
		int meio = (leftIndex + rightIndex) / 2;
		
		T[] array_sorted = Arrays.copyOf(array, 3);
		
		Arrays.sort(array_sorted);
		
		if (array_sorted[1].compareTo(array[leftIndex]) == 0) {
			return leftIndex;
		}else if(array_sorted[1].compareTo(array[meio]) == 0) {
			return meio;
		}else {
			return rightIndex;
		}
		
	}
	
	public int partition(T[] array, int leftIndex, int rightIndex) {
		
		int index_pivot = pickPivotIndex(array, leftIndex, rightIndex);
		
		Util.swap(array, index_pivot, leftIndex);
		
		T pivot = array[leftIndex];
	
		int i = leftIndex;
		
		for (int j = i + 1; j <= rightIndex; j++) {
			if (array[j].compareTo(pivot) <= 0) {
				i++;
				Util.swap(array, j, i);
			}
		}
		Util.swap(array, leftIndex, i);
		
		return i;
	}
}
