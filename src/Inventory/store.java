package Inventory;

import java.text.NumberFormat;

public class store {
	
	private double capital;
	private int inventory;
	private String name;

	public store(double capital, int inventory, String name) {
		// TODO Auto-generated constructor stub
		this.capital = capital;
		this.inventory = inventory;
		this.name = name;
	}
	
	public String getCapital() {
		String amount = String.valueOf(capital);
		return NumberFormat.getCurrencyInstance().format(amount);
	}
	
	public int getInventory() {
		return inventory;
	}
	
	public String getName() {
		return name;
	}
	
	public void addWeeklySaleLog() {
		
	}
	
	public void updateCapitalInventory() {
		
	}
	
	public void stockOrder(int quantity, int point, int amount) {
		
	}
	
	public void sendOrder() {
		
	}
	
	public void updateManifest() {
		
	}
	
	public double manifestCost() {
		return 0;
	}

}
