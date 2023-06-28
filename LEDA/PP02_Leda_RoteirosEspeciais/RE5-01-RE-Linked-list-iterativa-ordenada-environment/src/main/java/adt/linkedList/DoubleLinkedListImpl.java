package adt.linkedList;

public class DoubleLinkedListImpl<T> extends SingleLinkedListImpl<T> implements
		DoubleLinkedList<T> {

	protected DoubleLinkedListNode<T> last;

	@Override
	public void insertFirst(T element) {
		
		if (element != null) {
			
			DoubleLinkedListNode<T> nil = new DoubleLinkedListNode<T>();
			DoubleLinkedListNode<T> newNode = new DoubleLinkedListNode<T>();

			newNode.setData(element);
			newNode.setNext(head);
			((DoubleLinkedListNode<T>) head).setPrevious(newNode);
			newNode.setPrevious(nil);
			nil.setNext(newNode);
			
			if(head.isNIL()) {  //tava vazia
				last = newNode;
			}
			
			head = newNode;
		}
		
		
	}

	@Override
	public void removeFirst() {
		
		if(!isEmpty()) {
			
			head = head.getNext();
			
			if(head.isNIL()) {  //so tinha 1 elemento
				
				last = (DoubleLinkedListNode<T>) head;
				
			}else {
				
				DoubleLinkedListNode<T> nil = new DoubleLinkedListNode<T>();

				((DoubleLinkedListNode<T>) head).setPrevious(nil);
				nil.setNext(head);
				
			}

		}		
	}

	@Override
	public void removeLast() {
		
		if (!isEmpty()) {
			last = last.getPrevious();
			
			if (last.isNIL()) {
				head = last;
			} else {
				DoubleLinkedListNode<T> nil = new DoubleLinkedListNode<T>();
				last.setNext(nil);
				nil.setPrevious(last);
			}
		}
		
		
	}

	public DoubleLinkedListNode<T> getLast() {
		return last;
	}

	public void setLast(DoubleLinkedListNode<T> last) {
		this.last = last;
	}

}
