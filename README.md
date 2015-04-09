#CreditSuisseShoppingCart

Requirement:

Using any language you like, write a simple program that calculates the price of a basket of shopping. Items are presented one at a time, in a list, identified by name - for example "Apple" or "Banana". Multiple items are present multiple times in the list, so for example ["Apple", "Apple", "Banana"] is a basket with two apples and one banana.
 
Items are priced as follows:
- Apples are 35p each
- Bananas are 20p each
- Melons are 50p each, but are available as ‘buy one get one free’
- Limes are 15p each, but are available in a ‘three for the price two’ offer
 
Given a list of shopping, calculate the total cost of those items.

Language Used : Core Java [1.7]

Assumptions:

1) Only four items are considered (apples, bananas, melons and limes)as mentioned in the specification above
2) all calculations are done in pence. no conversion to pound is made.
3) It is assumed that the total price of shopping basket is not going to be more than max size of int primitive
4) if there are odd number of melons an exception is thrown notifying an extra melon can be added free
5) in case of lime if there is an excess lime in addition to multiples of three the cost of one lime is added to the total cost of lime.
   in case there are two limes in addition to the limes which are in multiples of three an exception is thrown depicting a free lime can be added to the basket.