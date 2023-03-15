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
public class QuickSortMedianOfThree<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int index_pivot = partition(array, leftIndex, rightIndex);
			sort(array, leftIndex, index_pivot - 1);
			sort(array, index_pivot + 1, rightIndex);
		}

	}

	public int medianOfThreekPivotIndex(T[] array, int leftIndex, int rightIndex) {
		
		int mid = (leftIndex + rightIndex) / 2;

		T[] array_aux = Arrays.copyOf(array, 3);

		array_aux[0] = array[leftIndex];
		array_aux[1] = array[mid];
		array_aux[2] = array[rightIndex];
		
		Arrays.sort(array_aux);
				
		if(array_aux[1].compareTo(array[leftIndex]) == 0) {
			return leftIndex;
		}
		else if (array_aux[1].compareTo(array[mid]) == 0) {
			return mid;
		}
		else return rightIndex;
	}

	public int partition(T[] array, int leftIndex, int rightIndex) {
		
		int medianOfThree_pivot_index = medianOfThreekPivotIndex(array, leftIndex, rightIndex);

       
        Util.swap(array, leftIndex, medianOfThree_pivot_index);
		
		T pivot =  array[leftIndex]; 
		int i = leftIndex;
		
		for (int j = leftIndex + 1; j <= rightIndex; j++) {
			if(array[j].compareTo(pivot) < 0) {
				i++;
				Util.swap(array, i, j);
			}
		}
		Util.swap(array, leftIndex, i);
		return i;
		
	}
}
