package com.sirma.itt.javacource.exceptions;

// TODO: Auto-generated Javadoc
/**
 * run class for ArrayWithExceptions.
 */
public final class RunArrayWithExceptions {
	/**
	 * constructor.
	 */
	private RunArrayWithExceptions() {

	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the args
	 */
	public static void main(String[] args) {
		ArrayWithExceptions arr = new ArrayWithExceptions(2);
		for (int i = 0; i < 3; i++) {
			try {
				arr.add(new Object());
			} catch (ArrayIsFull e) {
				e.printStackTrace();
			}
		}

	}
}
