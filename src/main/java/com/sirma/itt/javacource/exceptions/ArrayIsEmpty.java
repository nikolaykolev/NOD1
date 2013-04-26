package com.sirma.itt.javacource.exceptions;

// TODO: Auto-generated Javadoc
/**
 * array is empty exception.
 */
public class ArrayIsEmpty extends Exception {

	/**
	 * The Constructor.
	 */
	public ArrayIsEmpty() {
		super("Array is empty");
	}

	/**
	 * The Constructor.
	 * 
	 * @param message
	 *            the message
	 */
	public ArrayIsEmpty(String message) {
		super(message);
	}

	/**
	 * The Constructor.
	 * 
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public ArrayIsEmpty(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * The Constructor.
	 * 
	 * @param cause
	 *            the cause
	 */
	public ArrayIsEmpty(Throwable cause) {
		super(cause);
	}

}
