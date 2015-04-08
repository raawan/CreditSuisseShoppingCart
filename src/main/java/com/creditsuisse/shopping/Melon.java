package com.creditsuisse.shopping;

public class Melon extends Fruit {
	
	Melon() {
		
		this.setPrice(FruitPrice.MELON_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(FruitDiscount.TOTAL_MELONS_TO_BUY_TO_GET_A_FREE_MELON);
	}
	
	@Override
	public String toString() {
		
		return "melon";
	}
	
}
