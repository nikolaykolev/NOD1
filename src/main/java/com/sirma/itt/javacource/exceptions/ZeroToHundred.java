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
	 * @throws OutOfBoundsException
	 *             if number is not in range
	 */
	protected int read() throws OutOfBoundsException {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		int number = 0;

		try {
			number = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error while reading data from keyboard");
		}

		if (number > 100 || number < 0) {
			throw new OutOfBoundsException("Out of bounds 0-100");
		}

		return number;
	}

	/**
	 * override.
	 * 
	 * @param x
	 *            number
	 * @return x
	 * @throws OutOfBoundsException
	 *             if x is not between 0-100
	 */
	public int read(int x) throws OutOfBoundsException {
		if (x > 100 || x < 0) {
			throw new OutOfBoundsException("Out of bounds 0-100");
		}
		return x;
	}

}
