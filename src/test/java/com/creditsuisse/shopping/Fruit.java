package com.creditsuisse.shopping;

public abstract class Fruit {
	
	private int price;
	private int totalUnitsToBuyToGetFreeFruit;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotalUnitsToBuyToGetFreeFruit() {
		return totalUnitsToBuyToGetFreeFruit;
	}

	public void setTotalUnitsToBuyToGetFreeFruit(
			int totalUnitsToBuyToGetFreeFruit) {
		this.totalUnitsToBuyToGetFreeFruit = totalUnitsToBuyToGetFreeFruit;
	}
	
}