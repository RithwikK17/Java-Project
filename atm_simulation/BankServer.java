package com.atm_simulation;

public class BankServer {
	private static final int storedPin = 1234;

	public static int getPin() {
		return storedPin;
	}

	public static boolean validateLength(int pin) {
		boolean flag = false;
		String enteredPin = String.valueOf(pin);
		if (enteredPin.length() == 4)
			flag = true;
		return flag;
	}
}
