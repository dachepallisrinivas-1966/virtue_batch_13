package com.virtue.ui;

import com.virtue.exception.InsufficientBalanceException;
import com.virtue.model.Account;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		Account first = new Account(101, "srinivas", 10000);
		System.out.println("Current Balance = " + first.getBalance());
		first.deposit(500);
		System.out.println("Current Balance = " + first.getBalance());
		try {
			first.withdraw2(12000);
		} catch(InsufficientBalanceException excep) {
			first.setBalance(first.getBalance() - 12000);
			System.out.println("A O.D of 1500 is applicable - transaction is successful");
		}
		System.out.println("Current Balance = " + first.getBalance());
	}

}
