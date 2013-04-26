package com.sirma.itt.javacource.exceptions;

// TODO: Auto-generated Javadoc
/**
 * full array exception.
 * 
 * @author Fester
 */
public class ArrayIsFull extends Exception {

	/**
	 * Comment for serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The Constructor.
	 */
	public ArrayIsFull() {
		super("Array out of bounds");
	}

	/**
	 * The Constructor.
	 * 
	 * @param message
	 *            the message
	 */
	public ArrayIsFull(String message) {
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
	public ArrayIsFull(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * The Constructor.
	 * 
	 * @param cause
	 *            the cause
	 */
	public ArrayIsFull(Throwable cause) {
		super(cause);
	}

}
