package com.creditsuisse.shopping;

public class Melon extends Fruit {
	
	public static int MELON_PRICE = 50;
	public static int TOTAL_MELONS_TO_BUY_TO_GET_A_FREE_MELON = 1;
	
	Melon(int totalUnitsToBuyToGetFreeFruit) {
		
		this.setPrice(MELON_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(totalUnitsToBuyToGetFreeFruit);
	}
	
	@Override
	public String toString() {
		
		return "melon";
	}

	
}
