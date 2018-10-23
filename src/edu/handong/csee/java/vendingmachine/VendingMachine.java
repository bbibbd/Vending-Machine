package edu.handong.csee.java.vendingmachine;


public class VendingMachine {

	private int coin, price;
	private String product = "";

	public int getPrice(){
		return price;
	}

	public String getProduct(){
		return product;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public void showList() {
		System.out.println("1. Coca cola: 1000Won\n2. Pepsi cola: 900Won\n3. sprite: 1100Won\n4. Black coffee: 500Won\n5. White_coffee: 600Won\nChoose the product you want: ");
	}

	/**this method gets choice from user and set it to the vending machine.
	 * Each choices sets product and price
	*/
	public void settingProduct(int choice) {
		if(choice == 1) {
			product = "Coca cola";
			price = 1000;
		}
		else if(choice == 2) {
			product = "Pepsi cola";
			price = 900;
		}
		else if(choice == 3) {
			product = "Sprite";
			price = 1100;
		}
		else if(choice == 4) {
			product = "Black Coffee";
			price = 500;
		}
		else if(choice == 5) {
			product = "White Coffee";
			price = 600;
		}
	}

	
	public int returnChange() {
		System.out.printf("inserted %d won \n", coin);    
		if(coin>=price){
			System.out.printf("remains: %d won\n", coin-price);
			return 1;
		}
		else {
			price = price - coin;
			return 0;
		}
	}

}
