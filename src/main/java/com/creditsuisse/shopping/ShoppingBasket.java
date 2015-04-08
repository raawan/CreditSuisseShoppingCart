package com.creditsuisse.shopping;

public class ShoppingBasket {

	public int totalCost(String[] itemsInBasket) {
		
		int totalCost = 0;
		int totalMelons = 0;
		
		for(String item : itemsInBasket) {
			if(item.equals("Apple")) {
				totalCost += 35;
			}
			else if (item.equals("Banana")) {
				totalCost +=20;
			} else if (item.equals("Melon")) {
				totalMelons += 1;
			}
		}
		if(totalMelons>=2) {
			int totalPriceToBeCharged = (totalMelons /2) * 50;
			totalCost+=totalPriceToBeCharged;
		}
		return totalCost;
	}
	
}
