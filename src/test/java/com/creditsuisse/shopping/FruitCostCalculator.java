package com.creditsuisse.shopping;

public class FruitCostCalculator {
	
	private FruitCostCalculator () {}
	
	public static int calculateCostForApples(int totalApples) {
		
		return totalApples* Apple.APPLE_PRICE;
	}
	
	public static int calculateCostForBananas(int totalBananas) {
	
		return totalBananas * Banana.BANANA_PRICE;
	}
	
	public static int calculateCostForMelons(int totalMelons) throws InvalidNumberOfMelonException {
		
		if(totalMelons%(Melon.TOTAL_MELONS_TO_BUY_TO_GET_A_FREE_MELON+1)!=0){
			throw new InvalidNumberOfMelonException("There is a free extra melon with every melon. Customer should get one more");
		}
		if(totalMelons>=2) {
			return (totalMelons /2) * Melon.MELON_PRICE;
		}
		return 0;
	}
}
