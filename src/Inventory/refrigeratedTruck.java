package Inventory;

import java.util.*;

public class refrigeratedTruck extends truck {
	
	private int capacity = 800;
	private double cost;
	private Set<item> cargo;
	private double temp;

	public refrigeratedTruck(Set<item> cargo, double temp) {
		// TODO Auto-generated constructor stub
		super(cargo, temp);
		cost = 900 + 200 * (Math.pow(0.7, temp));
		this.temp = temp;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public double getCost() {
		return cost;
	}
	
	public boolean withinTemp(double temp) {
		return false;
	}

}
