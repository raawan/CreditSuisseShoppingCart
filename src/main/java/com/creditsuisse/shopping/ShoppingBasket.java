package com.creditsuisse.shopping;

import java.util.ArrayList;
import java.util.List;


public class ShoppingBasket {
	
	private List<Fruit> fruitGroupList = new ArrayList<Fruit>();
	private FruitFactory fruitFactory;
	private int totalMelons = 0;
	private int totalApples = 0;
	private int totalBananas = 0;
	
	ShoppingBasket(FruitFactory fruitFactory) {
		this.fruitFactory = fruitFactory;
	}
	
	public int totalCost(String[] itemsInBasket) throws InvalidNumberOfMelonException, InvalidItemException {
		
		createFruitList(itemsInBasket);
		return calculateTotalCost();
	}

	private int calculateTotalCost() throws InvalidNumberOfMelonException {
		
		int totalCost = 0;
		for(Fruit fruitGroup : fruitGroupList) {
			if(fruitGroup == null) {
				continue;
			} else {
				totalCost += fruitGroup.calculateTotalCostForNunits();
			}
		}
		return totalCost;
	}

	private void createFruitList(String[] itemsInBasket) throws InvalidItemException {

		for(String item : itemsInBasket) {
			item=item.toLowerCase();
			switch(item) {
				case "apple" 	: 	
									totalApples++;
									break;
				case "banana" 	: 	
									totalBananas++;
									break;
				case "melon"	: 	
									totalMelons++;
									break;
				default			: 	throw new InvalidItemException("Invalid Item In the List");					
			}
		}
		fruitGroupList.add(fruitFactory.createFruitGroup("Apples",totalApples));
		fruitGroupList.add(fruitFactory.createFruitGroup("Bananas",totalBananas));
		fruitGroupList.add(fruitFactory.createFruitGroup("Melons",totalMelons));
		
	}

	
}
 