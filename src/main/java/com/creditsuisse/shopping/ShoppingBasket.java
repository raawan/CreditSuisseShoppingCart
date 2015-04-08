package com.creditsuisse.shopping;

import java.util.ArrayList;
import java.util.List;


public class ShoppingBasket {
	
	FruitFactory fruitFactory;
	private int totalMelons = 0;
	private int totalApples = 0;
	private int totalBananas = 0;
	
	ShoppingBasket(FruitFactory fruitFactory) {
		this.fruitFactory = fruitFactory;
	}
	
	private List<Fruit> fruitList = new ArrayList<Fruit>();
	
	public int totalCost(String[] itemsInBasket) throws InvalidItemException, InvalidNumberOfMelonException {
		
		createFruitList(itemsInBasket);
		return calculateTotalCost();
	}

	private int calculateTotalCost() throws InvalidNumberOfMelonException {

		return FruitCostCalculator.totalCost(totalApples,totalBananas,totalMelons);
	}

	private void createFruitList(String[] itemsInBasket) throws InvalidItemException {

		for(String item : itemsInBasket) {
			item=item.toLowerCase();
			switch(item) {
				case "apple" 	: 	fruitList.add(fruitFactory.createFruit("Apple"));
									totalApples++;
									break;
				case "banana" 	: 	fruitList.add(fruitFactory.createFruit("Banana"));
									totalBananas++;
									break;
				case "melon"	: 	fruitList.add(fruitFactory.createFruit("Melon"));
									totalMelons++;
									break;
				default			: 	throw new InvalidItemException("Invalid Item In the List");					
			}
		}
	}

	
}
 