package adt.linkedList.ordered;

import java.util.Comparator;

import adt.linkedList.SingleLinkedListImpl;
import adt.linkedList.SingleLinkedListNode;

/**
 * Para testar essa classe voce deve implementar seu comparador. Primeiro
 * implemente todos os métodos requeridos. Depois implemente dois comparadores
 * (com idéias opostas) e teste sua classe com eles. Dependendo do comparador
 * que você utilizar a lista funcionar como ascendente ou descendente, mas a
 * implemntação dos métodos é a mesma.
 * 
 * @author Adalberto
 *
 * @param <T>
 */
public class OrderedSingleLinkedListImpl<T extends Comparable<T>> extends SingleLinkedListImpl<T> implements
		OrderedLinkedList<T> {

	private Comparator<T> comparator;

	public OrderedSingleLinkedListImpl(Comparator<T> comparator) {
		this.comparator = comparator;
	}

	@Override
	public T minimum() {
		
		@SuppressWarnings("unchecked")
		T menor_valor = (T) head.getData();
		SingleLinkedListNode<T> currentNode = head.getNext();
		
		while(!currentNode.isNIL()) {
			T data = currentNode.getData();
			if(comparator.compare(data, menor_valor) < 0) {
				menor_valor = data;
			}
			currentNode = currentNode.getNext();
		}
		return menor_valor;
		
		
	}

	@Override
	public T maximum() {
		
		T maior_valor = head.getData();
		SingleLinkedListNode<T> currentNode = head.getNext();
		
		while (!currentNode.isNIL()) {
			T data = currentNode.getData();
			if (comparator.compare(data, maior_valor) > 0) {
				maior_valor = data;
			}
			currentNode = currentNode.getNext();
		}
		return maior_valor;
		
		
	}

	public Comparator<T> getComparator() {
		return comparator;
	}

	public void setComparator(Comparator<T> comparator) {
		this.comparator = comparator;
	}
}
