package com.creditsuisse.shopping;

import java.util.ArrayList;
import java.util.List;

import static com.creditsuisse.shopping.FruitCostCalculator.*;

public class ShoppingBasket {
	
	FruitFactory fruitFactory;
	private int totalMelons = 0;
	private int totalApples = 0;
	private int totalBananas = 0;
	
	ShoppingBasket(FruitFactory fruitFactory) {
		this.fruitFactory = fruitFactory;
	}
	
	private List<Fruit> fruitList = new ArrayList<Fruit>();
	
	public int totalCost(String[] itemsInBasket) {
		
		createFruitList(itemsInBasket);
		return calculateTotalCost();
	}

	private int calculateTotalCost() {

		return calculateCostForApples(totalApples) +
				calculateCostForBananas(totalBananas) +
				calculateCostForMelons(totalMelons);
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
 