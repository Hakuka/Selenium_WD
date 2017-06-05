package com.google;

import com.google.GoogleTests;

public class General {

	public static void main(String[] args) throws InterruptedException{

	System.out.println("Lets gooooo");
	
	String strona;
	strona = GoogleTests.IsItGoogle(null);
	
	System.out.println(strona);
	
	if(strona.equals("Google"))
	{
		System.out.println("Yep, its google");
	}
	else
	{
		System.out.println("Nope, its not working");
	}

//	GoogleTests.RekSofSys(null);
}

	

}
