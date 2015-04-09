package com.creditsuisse.shopping;

public class FruitFactory {
	
	public Fruit createFruitGroup(String fruit, int totalUnits) {
		
		if(totalUnits <= 0) {
			return null;//ToDo : Null Object
		}
		fruit = fruit.toLowerCase();
		switch(fruit) {
			case "apples" 	: return new Apples(totalUnits);
			case "bananas" 	: return new Bananas(totalUnits);
			case "melons"	: return new Melons(totalUnits);
			default			: return null;//ToDo : Null Object
		}
	}
}
