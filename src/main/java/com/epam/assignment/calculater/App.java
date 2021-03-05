package com.epam.assignment.calculater;
import com.epam.assignment.Math.Mathsjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) 
	{
		System.out.println("Press + for addition, - for subtraction, * for multiplication and / for dividion");
		Integer ans = null;
		
		
		
		try 
		{
			Scanner s = new Scanner(System.in);
			char option = s.next().charAt(0);
			
			System.out.println("Enter 1st and 2nd digit");
			int x = s.nextInt();
			int y = s.nextInt();
			s.close();
			
			switch(option)
			{
				case '+': 
				{
					ans = Mathsjava.add(x,y);
					break;
				}
				case '-': 
				{
					ans = Mathsjava.subtract(x,y);
					break;
				}
				case '*': 
				{
					ans = Mathsjava.multiply(x,y);
					break;
				}
				case '/': 
				{
					ans = Mathsjava.divison(x,y);
					break;
				}
				default:
	    			throw new Exception("Invalid Operation");
			}
			
		} 
		
		catch(ArithmeticException ex) 
		{
    		System.out.println("Cannot divide by Zero.");
    	}
    	catch(InputMismatchException ex) {
    		System.out.println("Invalid Input.");
    	}
    	catch(Exception ex) {
    		System.out.println(ex.getMessage());
    	}
    	finally {
    		System.out.println("Answer = " + ans);
    	}

	}

}
