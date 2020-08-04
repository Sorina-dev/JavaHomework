package com.syntax.javahomework30;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * Create a Card class that will have implemented  and unimplemented methods and a constructor that will 
 * initializes credit card type.  Create 3 subclasses of a Card card. Create 3 objects of different card 
 * and store them into LinkedList.
 *  Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public class CardTest {


public static void main(String[] args) {
	
	LinkedList<Card> obj = new LinkedList<>();
	obj.add(new Visa ("Visa"));
	obj.add(new Visa ("MasterCard"));
	obj.add(new Visa ("Paypal"));
	
	System.out.println(" -----------------Using regular for loop-----------------------");
	
	for(int i = 0; i < obj.size(); i++) {
		obj.get(i).extract();
		obj.get(i).pay();
	}
	
	System.out.println(" -----------------Using enhanced for loop-----------------------");
	
	for(Card c : obj) {
		c.extract();
		c.pay();
	}
	
	System.out.println(" -----------------Using Iterator-----------------------");
	
	Iterator<Card> it = obj.iterator();
	while(it.hasNext()) {
		Card i = it.next();
		i.extract();
		i.pay();
	}
	
}
}
abstract class Card{
	
	String creditCardType;
	Card(String creditCardType){
		this.creditCardType = creditCardType;
	}
	public void extract() {
		System.out.println(creditCardType + " allows to extract money from ATM");
	}
	abstract void pay();
}
class Visa extends Card{
	
	Visa(String creditCardType){
		super(creditCardType);
	}
	
	void pay() {
		System.out.println(creditCardType + " allows to pay web applications");
	}
}
class MasterCard extends Card{
	
	MasterCard(String creditCardType){
		super(creditCardType);
	}
	void pay() {
		System.out.println(creditCardType + " doesn't allow to pay web applications");
	}
	
}
class Paypal extends Card{
	
	Paypal(String creditCardType){
		super(creditCardType);
	}
	void pay() {
		System.out.println(creditCardType + " allows to pay only products from abroad");
	}
}