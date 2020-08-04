package com.syntax.javahomework30;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour 
 * as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute 
 * as carModel and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList. 
 * Using for loop/advanced for loop/ iterator access all methods of the class. 
 */
public class InsuranceTest {
public static void main(String[] args) {
	
	ArrayList<Insurance> obj = new ArrayList<>();
	obj.add(new Car("Auto-Insurance", " Audi"));
	obj.add(new Pet("Pet-Insurance", "Dog"));
	obj.add(new Health("Human-Insurance"));
	
	System.out.println("--------Using regular for loop---------------------");
	
	for(int i = 0; i <obj.size(); i++) {
		obj.get(i).getQuote();
		obj.get(i).cancelInsurance();
	}
	
	System.out.println("--------Using advanced for loop---------------------");
	
	for(Insurance i : obj) {
		i.getQuote();
		i.cancelInsurance();
	}
	
	System.out.println("--------Using Iterator---------------------");
	
	Iterator <Insurance> it = obj.iterator();
	while(it.hasNext()) {
		Insurance i= it.next(); 
		i.getQuote();
		i.cancelInsurance();
	}
	
}
}
abstract class Insurance{
	
	String insuranceName;
	
	Insurance(String insuranceName){
		this.insuranceName = insuranceName;
	}
	
	abstract void getQuote();
	abstract void cancelInsurance();
}
class Car extends Insurance{
	
	String carModel;
	
	Car(String insuranceName,String carModel){
		super(insuranceName);
		this.carModel = carModel;
	}
	void getQuote() {
		System.out.println("The car "+ carModel + " can get the Insurance "+insuranceName);
	}
	void cancelInsurance() {
		System.out.println("The car " + carModel + " got the insurance " + insuranceName+ " cancelled" );
	}
}
class Pet extends Insurance{
	
	String petType;
	
	Pet(String insuranceName,String petType){
		super(insuranceName);
		this.petType = petType;
	}
	void getQuote(){
		System.out.println("The pet "+ petType + " can get the Insurance "+insuranceName);
	}
	void cancelInsurance() {
		System.out.println("The pet " + petType + " got the insurance " + insuranceName+ " cancelled" );
	}
	
}
class Health extends Insurance{
	Health(String insuranceName){
		super(insuranceName);
	}
	
	void getQuote(){
		System.out.println("The man can get the Insurance "+insuranceName);
	}
	void cancelInsurance() {
		System.out.println("The man got the insurance " + insuranceName+ " cancelled" );
	}
}