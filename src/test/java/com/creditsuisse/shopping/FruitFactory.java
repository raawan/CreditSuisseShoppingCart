package com.creditsuisse.shopping;

public class FruitFactory {
	
	public Fruit createFruit(String fruit) {
		
		fruit = fruit.toLowerCase();
		switch(fruit) {
			case "apple" 	: return new Apple(35);
			case "banana" 	: return new Banana(20);
			case "melon"	: return new Melon(50);
			default			: return null;
		}
	}
}
