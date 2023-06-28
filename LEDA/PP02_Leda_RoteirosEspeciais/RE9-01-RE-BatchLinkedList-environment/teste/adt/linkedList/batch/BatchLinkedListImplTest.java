package adt.linkedList.batch;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import adt.linkedList.DoubleLinkedListImpl;
import adt.linkedList.DoubleLinkedListNode;
import adt.linkedList.SingleLinkedListImpl;
import adt.linkedList.SingleLinkedListNode;
import adt.linkedList.batch.BatchLinkedListImpl;
import util.GenericException;

public class BatchLinkedListImplTest<T> {
	
	protected BatchLinkedListImpl<T> lista1;

	@Before
	public void setUp() throws Exception {
		
		getImplementations();
		lista1.insert(1);
	}

	private void getImplementations() {
		
		lista1 = new BatchLinkedListImpl<>();
	}

	@Test
	public void inserirEmBatch() {
		
		T[] array = (T[]) new Object[] {1,2,3,4};
		
		lista1.inserirEmBatch(0, array);
		
		assertEquals("1,2,3,1", lista1.toStringFromHead());
		
		
		
		
		
		
		
	}

}
