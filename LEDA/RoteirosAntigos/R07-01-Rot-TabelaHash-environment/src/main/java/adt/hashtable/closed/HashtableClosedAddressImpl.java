package adt.hashtable.closed;

import adt.hashtable.hashfunction.HashFunction;
import adt.hashtable.hashfunction.HashFunctionClosedAddress;
import adt.hashtable.hashfunction.HashFunctionClosedAddressMethod;
import adt.hashtable.hashfunction.HashFunctionFactory;
import util.Util;

import java.util.LinkedList;

public class HashtableClosedAddressImpl<T> extends
		AbstractHashtableClosedAddress<T> {

	/**
	 * A hash table with closed address works with a hash function with closed
	 * address. Such a function can follow one of these methods: DIVISION or
	 * MULTIPLICATION. In the DIVISION method, it is useful to change the size
	 * of the table to an integer that is prime. This can be achieved by
	 * producing such a prime number that is bigger and close to the desired
	 * size.
	 * 
	 * For doing that, you have auxiliary methods: Util.isPrime and
	 * getPrimeAbove as documented bellow.
	 * 
	 * The length of the internal table must be the immediate prime number
	 * greater than the given size (or the given size, if it is already prime). 
	 * For example, if size=10 then the length must
	 * be 11. If size=20, the length must be 23. You must implement this idea in
	 * the auxiliary method getPrimeAbove(int size) and use it.
	 * 
	 * @param desiredSize
	 * @param method
	 */

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public HashtableClosedAddressImpl(int desiredSize,
			HashFunctionClosedAddressMethod method) {
		int realSize = desiredSize;

		if (method == HashFunctionClosedAddressMethod.DIVISION) {
			realSize = this.getPrimeAbove(desiredSize); // real size must the
														// the immediate prime
														// above
		}
		initiateInternalTable(realSize);
		HashFunction function = HashFunctionFactory.createHashFunction(method,
				realSize);
		this.hashFunction = function;
	}

	// AUXILIARY
	/**
	 * It returns the prime number that is closest (and greater) to the given
	 * number.
	 * If the given number is prime, it is returned. 
	 * You can use the method Util.isPrime to check if a number is
	 * prime.
	 */
	int getPrimeAbove(int number) {
		int num = number;

		while(!Util.isPrime(num)){
			num += 1;
		}

		return num;
	}

	@Override
	public void insert(T element) {

		if(element != null && indexOf(element) == -1){

			int hash = ((HashFunctionClosedAddress<T>) this.hashFunction).hash(element);

			if(this.table[hash] == null)
				this.table[hash] = new LinkedList<T>();

			((LinkedList<T>)this.table[hash]).add(element);

			if (((LinkedList<T>) this.table[hash]).size() > 1)
				this.COLLISIONS++;

			this.elements++;
		}

	}

	@Override
	public void remove(T element) {

		if(element != null && !this.isEmpty()){

			if(search(element) != null){

				int hash = ((HashFunctionClosedAddress<T>) this.hashFunction).hash(element);

				((LinkedList<T>) this.table[hash]).remove(element);

				this.elements--;

			}

		}

	}

	@Override
	public T search(T element) {

		T result = null;

		if(element != null && !this.isEmpty()){

				int hash = ((HashFunctionClosedAddress<T>) this.hashFunction).hash(element);

				if(this.table[hash] != null){


					LinkedList<T> auxiliar = (LinkedList<T>) this.table[hash];

					int indice = 0;
					boolean achou = false;

					while(!achou && indice < auxiliar.size()){

						if(auxiliar.get(indice).equals(element)){
							result = auxiliar.get(indice);
							achou = true;
						}

						indice++;
					}

				}

		}

		return result;
	}

	@Override
	public int indexOf(T element) {
		int result = -1;

		if(element != null && !this.isEmpty()){

			int hash = ((HashFunctionClosedAddress<T>) this.hashFunction).hash(element);

			if(this.table[hash] != null){

				if(search(element) != null)
					result = hash;
			}

		}

		return result;
	}

}