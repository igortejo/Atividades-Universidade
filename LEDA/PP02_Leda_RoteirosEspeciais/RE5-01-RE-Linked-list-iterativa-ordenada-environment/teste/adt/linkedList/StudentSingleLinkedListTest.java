package adt.linkedList;


import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import adt.linkedList.SingleLinkedListImpl;

public class StudentSingleLinkedListTest {
	
	protected SingleLinkedListImpl lista1;
	protected SingleLinkedListImpl lista2;


	@Before
	public void setUp() throws Exception {
		
		getImplementations();
		
		lista1.insert(1);
		lista1.insert(2);
		lista1.insert(3);

		
		

		
		
	}

	private void getImplementations() {

		lista1 = new SingleLinkedListImpl();
		lista2 = new SingleLinkedListImpl();


	}

	@Test
	public void testIsEmpty() {
		
		assertFalse(lista1.isEmpty());
		assertTrue(lista2.isEmpty());

	}
	
	@Test
	public void size() {
		
		assertEquals(3, lista1.size());
		assertEquals(0, lista2.size());

	}
	
	@Test
	public void search() {
		
		assertEquals(1, lista1.search(1));
		assertEquals(3, lista1.search(3));
		assertNull(lista1.search(4));

	}
	
	@Test
	public void insert() {
		
		assertEquals(3, lista1.size());
		lista1.insert(4);
		lista1.insert(5);
		assertEquals(5, lista1.size());
		
		assertEquals(0, lista2.size());
		lista2.insert(1);
		lista2.insert(2);
		assertEquals(2, lista2.size());

	}
	
	@Test
	public void remove() {
		
		assertEquals(3, lista1.size());
		lista1.remove(2);
		lista1.remove(1);

		assertEquals(1, lista1.size());

	}
	
	@Test
	public void toArray() {
		
		assertArrayEquals(new Integer[]{1,2,3}, lista1.toArray());
		assertArrayEquals(new Integer[]{}, lista2.toArray());


	}

}
