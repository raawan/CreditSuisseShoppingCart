package com.creditsuisse.shopping;

public class Melon extends Fruit {
	
	public static final int TOTAL_MELONS_TO_BUY_TO_GET_A_FREE_MELON = 1;
	
	Melon() {
		
		this.setPrice(FruitPrice.MELON_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(TOTAL_MELONS_TO_BUY_TO_GET_A_FREE_MELON);
	}
	
	@Override
	public String toString() {
		
		return "melon";
	}
	
}
