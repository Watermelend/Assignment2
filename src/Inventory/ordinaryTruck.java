package Inventory;

import java.util.*;

public class ordinaryTruck extends truck {
	
	private int capacity = 1000;
	private double cost;
	private Set<item> cargo;
	private double temp;

	public ordinaryTruck(Set<item> cargo, double temp) {
		// TODO Auto-generated constructor stub
		super(cargo, temp);
		cost = 750 + (0.25 * cargo.size());
		this.temp = temp;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public double getCost() {
		return cost;
	}

}
