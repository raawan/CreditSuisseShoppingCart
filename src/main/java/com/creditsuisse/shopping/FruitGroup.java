package com.creditsuisse.shopping;

public abstract class FruitGroup {
	
	private int price;
	private int totalUnitsToBuyToGetFreeFruit;
	private int totalUnits;
	
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

	public int getTotalUnits() {
		return totalUnits;
	}

	public void setTotalUnits(int totalUnits) {
		this.totalUnits = totalUnits;
	}
	
	public abstract int calculateTotalCostForNunits() throws InvalidNumberOfMelonException;
}