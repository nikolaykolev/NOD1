package com.sirma.itt.javacourse.exceptions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sirma.itt.javacource.exceptions.ArrayIsEmpty;
import com.sirma.itt.javacource.exceptions.ArrayIsFull;
import com.sirma.itt.javacource.exceptions.ArrayWithExceptions;

/**
 * test class for array with exceptions.
 * 
 * @author Fester
 */
public class ArrayWithExceptionsTest {
	private ArrayWithExceptions arr = new ArrayWithExceptions(2);

	/**
	 * testing add method exception.
	 * 
	 * @throws ArrayIsFull
	 *             if array is full
	 */
	@Test(expected = ArrayIsFull.class)
	public void testFullArray() throws ArrayIsFull {
		arr.add(new Object());
		arr.add(new Object());
		arr.add(new Object());
	}

	/**
	 * testing printing method exception.
	 */
	@Test
	public void testPrintArray() {
		assertEquals("null null ", arr.allElements());
	}

	/**
	 * testing remove method exception.
	 * 
	 * @throws ArrayIsEmpty
	 *             if array is empty
	 */
	@Test(expected = ArrayIsEmpty.class)
	public void testEmptyArray() throws ArrayIsEmpty {
		arr.remove();
		arr.remove();
		arr.remove();
		arr.remove();
	}
}
