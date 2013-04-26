package com.sirma.itt.javacourse.exceptions;

import org.junit.Test;

import com.sirma.itt.javacource.exceptions.OutOfBounds;
import com.sirma.itt.javacource.exceptions.ZeroToHundred;

/**
 * test class for numbers between 0-100.
 * 
 * @author Fester
 */
public class ZeroToHundredTest {
	private ZeroToHundred range = new ZeroToHundred();

	/**
	 * testing numbers between 0-100 reader method exception.
	 * 
	 * @throws OutOfBounds
	 *             if array is full
	 */
	@Test(expected = OutOfBounds.class)
	public void testFullArray() throws OutOfBounds {
		range.read(111);
	}
}
