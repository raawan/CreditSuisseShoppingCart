package com.creditsuisse.shopping;

import java.util.ArrayList;
import java.util.List;
public class ShoppingBasket {
	
	FruitFactory fruitFactory;
	ShoppingBasket(FruitFactory fruitFactory) {
		this.fruitFactory = fruitFactory;
	}
	
	private List<Fruit> fruitList = new ArrayList<Fruit>();
	
	public int totalCost(String[] itemsInBasket) {
		
		int totalCost = 0;
		int totalMelons = 0;
		createFruitList(itemsInBasket);
		
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

	private void createFruitList(String[] itemsInBasket) {

		for(String item : itemsInBasket) {
			if(item.equals("Apple")) {
				fruitList.add(fruitFactory.createFruit("Apple"));
			} else if (item.equals("Banana")) {
				fruitList.add(fruitFactory.createFruit("Banana"));
			} else if (item.equals("Melon")) {
				fruitList.add(fruitFactory.createFruit("Melon"));
			}
		}
	}
	
}
 