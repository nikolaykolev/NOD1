package com.sirma.itt.javacource.exceptions;

import java.io.InputStream;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * reading numbers from console in range [0-100].
 * 
 * @author Fester
 */
public class ZeroToHundred {

	/**
	 * reader.
	 * 
	 * @return number
	 * @throws OutOfBounds
	 *             if number is not in range
	 */
	protected int read() throws OutOfBounds {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		int number = 0;
		try {
			number = sc.nextInt();
		} catch (Exception e) {
		}

		if (number > 100 || number < 0) {
			throw new OutOfBounds("Out of bounds 0-100");
		}

		return number;
	}

	/**
	 * override.
	 * 
	 * @param x
	 *            number
	 * @return x
	 * @throws OutOfBounds
	 *             if x is not between 0-100
	 */
	public int read(int x) throws OutOfBounds {
		if (x > 100 || x < 0) {
			throw new OutOfBounds("Out of bounds 0-100");
		}
		return x;
	}

}
