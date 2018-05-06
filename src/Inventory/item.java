/**
 * 
 */
package Inventory;

/**
 * @author Jason
 *
 */
public class item {
	
	private String name;
	private int quantity;
	private double cost;
	private double price;
	private int point;
	private int amount;
	private double temp;

	/**
	 * 
	 */
	public item(String name, int quantity, double cost, double price, int point, int amount, double temp) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.price = price;
		this.point = point;
		this.amount = amount;
		this.temp = temp;
	}
	
	public String getName() {
		return name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getCost() {
		return cost;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getPoint() {
		return point;
	}
	
	public int getAmount() {
		return amount;
	}

	public double getTemp() {
		return temp;
	}
}
