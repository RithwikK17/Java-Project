package com.atm_simulation;

import java.util.Scanner;

public class AtmUtil {
	private static final int minBal = 500;
	private static int currentBal = minBal;

	public static String deposit(Scanner in) {
		System.out.println("Enter the amount to deposit");
		int depositedAmount = in.nextInt();
		if (depositedAmount >= 100) {
			currentBal += depositedAmount;
			return "Amount credited Successfully";
		}
		return "Invalid Amount";
	}
	public static String withdrawAmount(Scanner in) {
		System.out.println("Enter the amount to be withdrawn:");
		int withdrawnAmount = in.nextInt();
		if (withdrawnAmount <= (getBal() - minBal)) {
			currentBal -= withdrawnAmount;
			return "Amount debited successfully";
		}
		return "Insufficient Balance";
	}
	public static int getBal() {
		return currentBal;
	}
}
