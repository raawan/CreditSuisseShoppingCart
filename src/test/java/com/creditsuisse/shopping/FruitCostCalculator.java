package com.creditsuisse.shopping;

public class FruitCostCalculator {
	
	private FruitCostCalculator () {}
	
	public static int calculateCostForApples(int totalApples) {
		
		return totalApples* Apple.APPLE_PRICE;
	}
	
	public static int calculateCostForBananas(int totalBananas) {
	
		return totalBananas * Banana.BANANA_PRICE;
	}
	
	public static int calculateCostForMelons(int totalMelons) {
		
		if(totalMelons>=2) {
			return (totalMelons /2) * Melon.MELON_PRICE;
		}
		return 0;
	}
}
