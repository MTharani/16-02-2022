package com.oopconsept;

public class Mobile 
{
	String company;
	String brand;
	String Ram;
	String color;
	double price;
	public Mobile() 
	{
		company="VIVO";
		brand="VIVO  1815";
		Ram= "4GB";
		color="Black";
		price=45000;
		
	}
public void getMobile()
{
	System.out.println("COMPANY NAME:"+company);
	System.out.println("BRAND NAME:"+brand);
	System.out.println("RAM:"+Ram);
	System.out.println("COLOR:"+color);
	System.out.println("PRICE:"+price);
}
	public static void main(String[] args) {
		Mobile mobile1=new Mobile();
		mobile1.getMobile();

	}

}
