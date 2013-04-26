package com.sirma.itt.javacource.exceptions;

// TODO: Auto-generated Javadoc
/**
 * Exception class for our of range number [0-100].
 */
public class OutOfBounds extends Exception {

	/**
	 * The Constructor.
	 */
	public OutOfBounds() {
		super("Number out of bounds");
	}

	/**
	 * The Constructor.
	 * 
	 * @param message
	 *            the message
	 */
	public OutOfBounds(String message) {
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
	public OutOfBounds(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * The Constructor.
	 * 
	 * @param cause
	 *            the cause
	 */
	public OutOfBounds(Throwable cause) {
		super(cause);
	}

}
