package com.creditsuisse.shopping;
import static com.creditsuisse.shopping.FruitPrice.*;

public class FruitCostCalculator {
	
	private FruitCostCalculator () {}
	
	private static int calculateCostForApples(int totalApples) {
		
		return totalApples* APPLE_PRICE;
	}
	
	private static int calculateCostForBananas(int totalBananas) {
	
		return totalBananas * BANANA_PRICE;
	}
	
	private static int calculateCostForMelons(int totalMelons) throws InvalidNumberOfMelonException {
		
		if(totalMelons%(Melon.TOTAL_MELONS_TO_BUY_TO_GET_A_FREE_MELON+1)!=0){
			throw new InvalidNumberOfMelonException("There is a free extra melon with every melon. Customer should get one more");
		}
		return (totalMelons /(Melon.TOTAL_MELONS_TO_BUY_TO_GET_A_FREE_MELON+1)) * MELON_PRICE;
	}
	
	public static int totalCost(int totalApples,int totalBananas,int totalMelons) throws InvalidNumberOfMelonException {
		
		return calculateCostForApples(totalApples) +
				calculateCostForBananas(totalBananas) +
				calculateCostForMelons(totalMelons);
	}
}
