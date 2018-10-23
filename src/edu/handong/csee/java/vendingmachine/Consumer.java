package edu.handong.csee.java.vendingmachine;
import java.util.Scanner;

public class Consumer {
	Scanner keyboard = new Scanner(System.in);
	VendingMachine vm = new VendingMachine();	

	public int chooseProduct() {
		int choice;
		choice = keyboard.nextInt();
		return choice;
	}
}

