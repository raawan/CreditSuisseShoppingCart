package com.creditsuisse.shopping;

public class Melon extends Fruit {
	
	public static int MELON_PRICE = 50;
	
	Melon(int totalUnitsToBuyToGetFreeFruit) {
		
		this.setPrice(MELON_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(totalUnitsToBuyToGetFreeFruit);
	}
	
	@Override
	public String toString() {
		
		return "melon";
	}

	
}
