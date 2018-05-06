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

}
