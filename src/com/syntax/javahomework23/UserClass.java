package com.syntax.javahomework23;
/*
 * Write program: userClass  that has a constructor that initializes instance variable name and mobile number. 
 * Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call. 
 * Print users name, mobile number and address in userDetails method. Test your code.
 */
public class UserClass {

	String name, mobileNr;
	
	public UserClass(String name, String mobileNr) {
		this.name = name;
		this.mobileNr = mobileNr;
	}

	}
	

class UserInfo extends UserClass{
	
	String address;
	
	UserInfo(String name, String mobileNr, String address){
		super(name, mobileNr);
		this.address = address;
	}
	
	public void userDetails() {
		System.out.println("User's name is "+ name + ". Mobile phone number is "+ mobileNr + ". He lives on the address "+ address);
	}	

	public static void main(String[] args) {
		
		UserInfo u = new UserInfo("Marshall","876-245-2345", "NY, str.Pineaaple 56");
		u.userDetails();
	}
}
