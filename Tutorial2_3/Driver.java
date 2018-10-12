package Tutorial2_3;

public class Driver {
	
	public static void main(String [] args){
		
		Stock item1 = new Stock(100, "Red Socks", 100);
		Stock item2 = new Stock(101, "Blue Socks", 90);
		Stock item3 = new Stock(102, "Green Socks", 50);
		
		item1.displayAllDetails();
		item2.displayAllDetails();
		item3.displayAllDetails();
		
		item1.updateStockAmount(100);
		item3.updateStockAmount(60);
		item2.updateStockAmount(20);
		
		item1.displayAllDetails();
		item2.displayAllDetails();
		item3.displayAllDetails();
	}

}
