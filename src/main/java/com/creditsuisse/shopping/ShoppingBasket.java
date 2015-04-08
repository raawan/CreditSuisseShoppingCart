package com.creditsuisse.shopping;

import java.util.ArrayList;
import java.util.List;
public class ShoppingBasket {
	
	private List<Fruit> fruitList = new ArrayList<Fruit>();
	
	public int totalCost(String[] itemsInBasket) {
		
		int totalCost = 0;
		int totalMelons = 0;
		
		for(String item : itemsInBasket) {
			if(item.equals("Apple")) {
				fruitList.add(new Apple(35));
			}
			else if (item.equals("Banana")) {
				fruitList.add(new Banana(20));
			} else if (item.equals("Melon")) {
				fruitList.add(new Melon(50));
			}
		}
		
		for(Fruit fruit: fruitList) {
			if(fruit.toString().equalsIgnoreCase("Melon")) {
				totalMelons += 1;
			} else {
				totalCost += fruit.getPrice();	
			}
		}
		
		if(totalMelons>=2) {
			int totalPriceToBeCharged = (totalMelons /2) * 50;
			totalCost+=totalPriceToBeCharged;
		}
		
		return totalCost;
	}
	
}
 