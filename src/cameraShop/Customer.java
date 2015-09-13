package cameraShop;

import java.util.ArrayList;
import java.util.Collections;

public class Customer {

	private static ArrayList<Integer> IDList = new ArrayList<Integer>();
	
	private int ID;
	private String firstname;
	private String prefix;
	private String lastname;
	private int age;
	private String sex;
	private String city;
	private String email;
	
	/**
	 * Print a list of all customers
	 */
	public static void printCustomerList(){
		// TODO: Build the class to print a list of all the customers
		// Return void and print from this method? 
		// OR
		// Return array so the calling class can print the list?
	}
	
	//Constructor Customer without Prefix:
	public Customer(String firstname, String lastname, int age, String sex, String city){
		this.ID = this.hashCode();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.sex = sex;
		this.city = city;
	}

	//Constructor Customer with Prefix:
	public Customer(String firstname, String prefix, String lastname, int age, String sex, String city){
		this.ID = this.hashCode();
		this.firstname = firstname;
		this.prefix = prefix;
		this.lastname = lastname;
		this.age = age;
		this.sex = sex;
		this.city = city;
	}
		
	//Sets email addresses from customers:
	public void setEmail(String email){
		this.email = email;
	}
	
	//Get the fullname of specific customer:
	public String getFullName(){
		String fullname;
		
		fullname = this.firstname + " ";
		if(this.prefix != null){
			fullname += this.prefix + " ";
		}
		fullname += this.lastname;
		
		return fullname;
	}	
	
	//Get the ID of specific customer:
	public int getID(){
		return this.ID;
	}
	
}
