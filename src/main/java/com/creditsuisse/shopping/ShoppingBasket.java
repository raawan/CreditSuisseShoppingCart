package com.creditsuisse.shopping;

import java.util.ArrayList;
import java.util.List;
public class ShoppingBasket {
	
	FruitFactory fruitFactory;
	private int totalCost = 0;
	private int totalMelons = 0;
	private int totalApples = 0;
	private int totalBananas = 0;
	
	ShoppingBasket(FruitFactory fruitFactory) {
		this.fruitFactory = fruitFactory;
	}
	
	private List<Fruit> fruitList = new ArrayList<Fruit>();
	
	public int totalCost(String[] itemsInBasket) {
		
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
				totalApples+=1;
			} else if (item.equals("Banana")) {
				fruitList.add(fruitFactory.createFruit("Banana"));
				totalBananas+=1;
			} else if (item.equals("Melon")) {
				fruitList.add(fruitFactory.createFruit("Melon"));
				totalMelons+=1;
			}
		}
	}
	
}
 