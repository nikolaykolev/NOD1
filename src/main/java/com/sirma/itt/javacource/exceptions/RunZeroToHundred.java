package com.sirma.itt.javacource.exceptions;

/**
 * run class for zero to hundred.
 * 
 * @author Fester
 */
public final class RunZeroToHundred {
	/**
	 * constructor.
	 */
	private RunZeroToHundred() {

	}

	private static ZeroToHundred readNumbers = new ZeroToHundred();

	/**
	 * @param args
	 *            no
	 * @throws OutOfBounds
	 *             if number is not in range [0-100]
	 */
	public static void main(String[] args) throws OutOfBounds {
		for (int i = 0; i < 10; i++) {
			System.out.println(readNumbers.read());
		}

	}

}
