package com.creditsuisse.shopping;

public class FruitFactory {
	
	public Fruit createFruit(String fruit) {
		
		fruit = fruit.toLowerCase();
		switch(fruit) {
			case "apple" 	: return new Apple(0);
			case "banana" 	: return new Banana(0);
			case "melon"	: return new Melon(1);
			default			: return null;//ToDo : Null Object
		}
	}
}
