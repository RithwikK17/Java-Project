package com.atm_simulation;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to ABC Bank.");
		int attempt = 1;
		char resp;
		while (attempt < 4) {
			System.out.println("Enter your pin to continue...");
			Scanner in = new Scanner(System.in);
			int enteredPin = in.nextInt();
			if (BankServer.validateLength(enteredPin) && enteredPin == BankServer.getPin()) {
				// enter code here
				do {
					System.out.println("1.Deposit  2.Withdraw  3.Balance Enquiry");
					System.out.println("Select one option");
					int option = in.nextInt();
					switch (option) {
					case 1:
						System.out.println(AtmUtil.deposit(in));
						break;
					case 2:
						System.out.println(AtmUtil.withdrawAmount(in));
						break;
					case 3:
						System.out.println(AtmUtil.getBal());
						break;
					default:
						System.out.println("Invalid option");
					}
					System.out.println("Do you want to continue?? y/n ");
					resp = in.next().charAt(0);
				} while (resp == 'y');
				break;
			} else {
				System.out.println("Wrong Pin");
				System.out.println("Remaining attempts: " + (3 - attempt));
				attempt++;
				if (attempt == 4) {
					System.out.println("Card Blocked for the next 24 hours. Connect to your nearest branch");
				}
			}
		}
		System.out.println("Thanks for Banking with us.");
	}
}
