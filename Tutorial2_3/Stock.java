package Tutorial2_3;

import java.util.Scanner;

public class Stock {
	
	private Scanner kboard = new Scanner(System.in);
	private long stockNo;
	private String stockDescr;
	private int stockAmount;
	
	public Stock(long num, String descr, int amount){
		
		stockNo = num;
		stockDescr = descr;
		stockAmount = amount;
	}
	
	public int displayAmountInStock(){
		return stockAmount;
	}

	public void displayAllDetails(){
		System.out.println("Stock Number: "+stockNo);
		System.out.println("Description: "+stockDescr);
		System.out.println("Amount in stock: "+stockAmount);
	}

	public void updateStockAmount(int amountBought){
		if(decisionMenu(amountBought) == 1){
			
			if(checkStock(amountBought)){
				stockAmount = stockAmount - amountBought;
			}else{
				System.out.println("There is not enough stock for this purchase");
			}
			
		}else{
			stockAmount = stockAmount+amountBought;
		}
	}
	
	public boolean checkStock(int amountBought){
		
		if(stockAmount >= amountBought){
			return true;
		}else{
			return false;
		}
	}
	
	
	public int decisionMenu(int amountBought){
		System.out.println("Choose from the following: ");
		System.out.println("1. Deduct "+amountBought+" "+stockDescr);
		System.out.println("2. Add "+amountBought+" "+stockDescr);
		int choice = kboard.nextInt();
		return choice;
	}

}