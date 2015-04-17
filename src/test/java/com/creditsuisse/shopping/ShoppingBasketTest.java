package com.creditsuisse.shopping;

import static org.junit.Assert.*;

import org.junit.Test;

import com.creditsuisse.shopping.exception.FreeLimeRequiredException;
import com.creditsuisse.shopping.exception.InvalidItemException;
import com.creditsuisse.shopping.exception.FreeMelonRequiredException;

public class ShoppingBasketTest {
	
	
	@Test
	public void givenBasketWithOneAppleTotalCostReturnedShouldBe35p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Apple"};
		assertEquals(35, getTotalCostOfBasket(itemsInBasket));
	}
	

	@Test
	public void givenBasketWithTwoAppleTotalCostReturnedShouldBe70p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Apple","Apple"};
		assertEquals(70, getTotalCostOfBasket(itemsInBasket));
	}
	
	@Test
	public void givenBasketWithTwoApplesAndOneBananaTotalCostReturnedShouldBe90p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Apple","Banana","Apple"};
		assertEquals(90, getTotalCostOfBasket(itemsInBasket));
	}
	
	@Test
	public void givenBasketWithTwoApplesTwoMelonsAndOneBananaTotalCostReturnedShouldBe140p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Apple","Banana","Apple","Melon","Melon"};
		assertEquals(140, getTotalCostOfBasket(itemsInBasket));
	}
	
	@Test (expected=InvalidItemException.class)
	public void givenBasketListWithInvalidInputAnInvalidItemExceptionShouldBeThrown() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Apple","Banana","Apple","invalidItem"};
		getTotalCostOfBasket(itemsInBasket);
	}
	
	@Test (expected=FreeMelonRequiredException.class)
	public void givenBasketWithThreeMelonsAnInvalidNumberOfMelonExceptionShouldBeThrown() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Melon","Melon","Melon"};
		getTotalCostOfBasket(itemsInBasket);
	}
	
	@Test (expected=FreeMelonRequiredException.class)
	public void givenBasketWithOneMelonsAnInvalidNumberOfMelonExceptionShouldBeThrown() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Melon"};
		getTotalCostOfBasket(itemsInBasket);
	}
	
	@Test
	public void givenBasketWithFourMelonsAnInvalidNumberOfMelonTotalCostReturnedShouldBe100p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Melon","Melon","Melon","Melon"};
		assertEquals(100, getTotalCostOfBasket(itemsInBasket));
	}
	
	@Test
	public void givenEmptyBasketTotalCostReturnedShouldBe0p() throws FreeMelonRequiredException, InvalidItemException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {};
		assertEquals(0, getTotalCostOfBasket(itemsInBasket));
	}
	
	@Test
	public void givenBasketWithThreeLimesTotalCostReturnedShouldBe30p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Lime","Lime","Lime"};
		assertEquals(30, getTotalCostOfBasket(itemsInBasket));
	}
	
	@Test
	public void givenBasketWithSixLimesTotalCostReturnedShouldBe60p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Lime","Lime","Lime","Lime","Lime","Lime"};
		assertEquals(60, getTotalCostOfBasket(itemsInBasket));
	}
	
	@Test
	public void givenBasketWithSevenLimesTotalCostReturnedShouldBe75p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Lime","Lime","Lime","Lime","Lime","Lime","Lime"};
		assertEquals(75, getTotalCostOfBasket(itemsInBasket));
	}
	
	@Test
	public void givenBasketWithOneLimeTotalCostReturnedShouldBe15p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Lime"};
		assertEquals(15, getTotalCostOfBasket(itemsInBasket));
	}
	
	@Test (expected=FreeLimeRequiredException.class)
	public void givenBasketWithTwoLimesAnAdditionalLimeRequiredExceptionShouldBeThrown() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Lime","Lime"};
		assertEquals(15, getTotalCostOfBasket(itemsInBasket));
	}
	
	@Test
	public void givenBasketWith4Limes2Melons2Bananas2ApplesTotalCostReturnedShould205p() throws FreeMelonRequiredException, InvalidItemException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Lime","Lime","Lime","Lime","Melon","Melon","Banana","Banana","Apple","Apple"};
		assertEquals(205, getTotalCostOfBasket(itemsInBasket));
	}
	
	private int getTotalCostOfBasket(String[] itemsInBasket) throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		ShoppingBasket shoppingBasket = new ShoppingBasket(itemsInBasket);
		return shoppingBasket.totalCost();
	}
}
