package edu.handong.csee.java.vendingmachine;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int choice, coin;

		Scanner keyboard = new Scanner(System.in);		
		VendingMachine vm = new VendingMachine();
		Consumer cm = new Consumer();		

		for(;;){
			vm.showList();
			choice = cm.chooseProduct();
			if (choice < 6){
				vm.settingProduct(choice);
				System.out.printf("%s is selected. ",vm.getProduct());
				break;
			}
			else  System.out.println("Wrong number. Choose another.");
		} 

		for(;;){
			System.out.printf("Please insert %d won.",vm.getPrice());
			coin = keyboard.nextInt();
			vm.setCoin(coin);

			if(vm.returnChange()==1)  {
				System.out.printf("take %s",vm.getProduct()); 
				break;    
			}
			else
				System.out.printf("need %d won more\n", vm.getPrice());
		}
	}

}
