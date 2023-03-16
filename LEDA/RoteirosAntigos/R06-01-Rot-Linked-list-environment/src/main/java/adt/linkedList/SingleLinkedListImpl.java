package adt.linkedList;

public class SingleLinkedListImpl<T> implements LinkedList<T> {

	protected SingleLinkedListNode<T> head;

	public SingleLinkedListImpl() {
		this.head = new SingleLinkedListNode<T>();
	}

	@Override
	public boolean isEmpty() {
		return this.head.isNIL();
	}

	@Override
	public int size() {
		int size = 0;
		SingleLinkedListNode<T> aux = head;
		while (!aux.isNIL()) {
			size++;
			aux = aux.getNext();
		}
		return size;
	}

	@Override
	public T search(T element) {
		T saida = null;
		if (element != null && !isEmpty()) {

			SingleLinkedListNode<T> aux = head;
			while (!aux.isNIL()) {
				if (aux.getData().equals(element)) {
					saida = aux.getData();
				}
				aux = aux.getNext();
			}

		}
		return saida;
	}

	@Override
	public void insert(T element) {
		if (element != null) {
			SingleLinkedListNode<T> aux;
			aux = head;
			while (!aux.isNIL()) {
				aux = aux.getNext();
			}
			aux.setData(element);
			aux.setNext(new SingleLinkedListNode<>());
		}
	}

	@Override
	public void remove(T element) {
if (element != null && !isEmpty()) {
			
			if(this.head.data.equals(element)) {
				this.head = head.getNext();
			}
			else {
				SingleLinkedListNode<T> aux = head;
				SingleLinkedListNode<T> previous = head;
				while(!aux.isNIL() && !aux.getData().equals(element)) {
					previous = aux;
					aux = aux.getNext();
				}
				if(!aux.isNIL()) {
					previous.next = aux.next;
				}	
			}
		}
	}

	@Override
	public T[] toArray() {
		@SuppressWarnings("unchecked")
		T[] saida = (T[]) new Comparable[size()];
		int count = 0;
		SingleLinkedListNode<T> aux = head;
		while (!aux.isNIL()) {
			saida[count++] = aux.getData();
			aux = aux.getNext();
		}
		return saida;
	}

	public SingleLinkedListNode<T> getHead() {
		return head;
	}

	public void setHead(SingleLinkedListNode<T> head) {
		this.head = head;
	}

}
