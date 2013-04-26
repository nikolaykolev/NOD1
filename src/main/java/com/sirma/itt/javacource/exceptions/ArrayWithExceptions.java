package com.sirma.itt.javacource.exceptions;

/**
 * add,remove,print objects array with exceptions.
 */
public class ArrayWithExceptions {

	/** The obj array. */
	private Object[] obj;

	/** The iterator. */
	private int iterator = 0;

	/**
	 * The Constructor.
	 * 
	 * @param length
	 *            the length
	 */
	public ArrayWithExceptions(int length) {
		obj = new Object[length];
	}

	/**
	 * Adds object.
	 * 
	 * @param object
	 *            the object
	 * @throws ArrayIsFull
	 *             the array is full
	 */
	public void add(Object object) throws ArrayIsFull {
		if (iterator == obj.length - 1) {
			throw new ArrayIsFull("The array is full");
		}
		obj[iterator] = object;
		iterator++;
	}

	/**
	 * Removes the last added element.
	 * 
	 * @throws ArrayIsEmpty
	 *             the array is empty
	 */
	public void remove() throws ArrayIsEmpty {
		if (iterator == 0) {
			throw new ArrayIsEmpty();
		}
		obj[iterator] = null;
		iterator--;

	}

	/**
	 * Prints all elements.
	 * 
	 * @return string with all elements
	 */
	public String allElements() {
		String res = "";
		for (int i = 0; i < obj.length; i++) {
			res += obj[i] + " ";
		}
		return res;
	}

	/**
	 * Prints all elements.
	 */
	public void printAllElements() {
		System.out.println(allElements());
	}

	/**
	 * Getter method for objectArray.
	 * 
	 * @return the objectArray
	 */
	public Object[] getObjArray() {
		return obj;
	}

	/**
	 * Setter method for objectArray.
	 * 
	 * @param objArray
	 *            the obj array
	 */
	public void setObjArray(Object[] objArray) {
		this.obj = objArray;
	}
}
