package com.creditsuisse.shopping;

public class ShoppingBasket {

	public int totalCost(String[] itemsInBasket) {
		
		int totalCost = 0;
		for(String item : itemsInBasket) {
			if(item.equals("Apple")) {
				totalCost += 35;
			}
		}
		return totalCost;
	}
	
}
