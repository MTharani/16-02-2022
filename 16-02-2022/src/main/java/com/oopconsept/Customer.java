package com.oopconsept;

public class Customer
{    //state(variable)
	int id;
	String name;
	String address;
	String phonenumber;
	public Customer() 
	{    //constructor
		id=258;
		name="Dhivya";
		address="Pondy";
		phonenumber="9658321567";
	}
	public void getCustomer()
	{
		System.out.println("ID:"+id);
		System.out.println("NAME:"+name);
		System.out.println("ADDRESS:"+address);
		System.out.println("PHONE NUMBER:"+phonenumber);
	}

	public static void main(String[] args) 
	{
	Customer customer1=new Customer();
     customer1.getCustomer();
	}

}
