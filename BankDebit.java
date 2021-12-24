package com.bridglabz.decards;

import java.util.Scanner;
import java.util.Random;

public class BankDebit {
	Random rand = new Random();
	static Debit d = new Debit();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		 
		BankDebit main = new BankDebit();
		Scanner sc = new Scanner(System.in);
		BankDebit b = new BankDebit();
		d.setAcBalance((int) (Math.random() * 10000) % 10000 + 1000);
		boolean value=false;
		while (value!=true) {
		System.out.println("Please Select Following Option \n 1.CheckBalance \n 2.DebitAmount\n 3.Exit");
		int option = sc.nextInt();
			switch (option) {
			case 1:
				main.checkBalance();
				break;
			case 2:

				main.debitAmount();
				break;
			case 3:
				value=false;
			}

		}
	}

	public void checkBalance() {
		System.out.println("your current Amount is "+d.getAcBalance());
	}

	public void debitAmount() {
		System.out.println("Enter your Amount:: ");
		d.setAmount(sc.nextInt());
		if(d.getAmount()>d.getAcBalance()) {
			System.out.println("sorry not available balance");
		}else {
		d.setAcBalance(d.getAcBalance() - d.getAmount());
		System.out.println("your balance is debited successfully......");
		System.out.println("your current balance is " + d.getAcBalance());
		}
	}
}

class Debit {
	private int amount;
	private int AcBalance;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAcBalance() {
		return AcBalance;
	}

	public void setAcBalance(int acBalance) {
		AcBalance = acBalance;
	}


}