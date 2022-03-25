package com.oopconsept;

import java.util.Scanner;

public class Laptop
{
	String brand;
	int price;
	public Laptop() 
	{
		for(int i =1; i<=3; i++)
		{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the laptop name:");
	brand=scanner.next();
	System.out.println("Enter the price:");
	price=scanner.nextInt();
	scanner.close();
		}
	}
	public void getLaptop()
	{
		System.out.println(brand);
		System.out.println(price);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Laptop laptop1=new Laptop();
		laptop1.getLaptop();
	}
	

}
