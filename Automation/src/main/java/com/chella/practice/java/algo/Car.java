package com.chella.practice.java.algo;

import java.util.HashMap;

public class Car {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		return prime;
	}

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Car other = (Car) obj;
//		if (make == null) {
//			if (other.make != null)
//				return false;
//		} else if (!make.equals(other.make))
//			return false;
//		if (model == null) {
//			if (other.model != null)
//				return false;
//		} else if (!model.equals(other.model))
//			return false;
//		if (year != other.year)
//			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car  Selva [year=" + year + ", make=" + make + ", model=" + model + "]";
	}

	public Car(int year, String make, String model) {
		super();
		this.year = year;
		this.make = make;
		this.model = model;
	}

	private int year;
	private String make;
	private String model;
	
	public static void main(String[] args) {
		HashMap<Car, Integer> price = new HashMap<Car, Integer>(); // 1M
		Car bmw = new Car(2014, "BMW", "328i");
		price.put(bmw,	10000);
		Car ford = new Car(2014, "Ford", "Mustang");
		price.put(ford,	4000);
		price.put(new Car(2014, "Honda", "Accord"),	5000);
		
		System.out.println(price.get(bmw));
		
		System.out.println(price.get(ford));
		
	}

}
