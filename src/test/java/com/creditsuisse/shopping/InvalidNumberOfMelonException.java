package com.creditsuisse.shopping;

public class InvalidNumberOfMelonException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1978900443209641819L;
	
	private InvalidNumberOfMelonException(String msg, int totalMelons) {
		super("There is a free extra melon with every melon. Customer should get one more");
	}
}
