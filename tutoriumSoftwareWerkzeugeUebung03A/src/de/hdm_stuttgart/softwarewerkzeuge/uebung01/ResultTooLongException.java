/**
 * 
 */
package de.hdm_stuttgart.softwarewerkzeuge.uebung01;

/**
 * @author elcpt
 *
 */
public class ResultTooLongException extends Exception {

	/**
	 * 
	 */
	public ResultTooLongException() {
		
	}

	/**
	 * @param message
	 */
	public ResultTooLongException(String message) {
		super(message);
		
	}

	/**
	 * @param cause
	 */
	public ResultTooLongException(Throwable cause) {
		super(cause);
		
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ResultTooLongException(String message, Throwable cause) {
		super(message, cause);
		
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ResultTooLongException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	
	}

}
