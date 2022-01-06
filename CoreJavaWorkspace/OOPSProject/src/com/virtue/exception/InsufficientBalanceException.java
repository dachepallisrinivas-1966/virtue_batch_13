package com.virtue.exception;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String errMsg) {
		super(errMsg);
	}
}
