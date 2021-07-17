package week1.day1;

import java.util.Iterator;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Print whether the given number is Prime or Not
		
		int number = 47;
		int n = number/2;
		//n=7
		//
		boolean flag = false;
		
		for (int i=2;i<=n; i++)
		{

			if (number %i==0)
			{
				flag=true;
				break; 
			}
		}
			if (flag==true) 
			
				System.out.println("Number is not a prime number");
			
			else 
			
				System.out.println(number+" is a prime number");
		
		System.out.println("End of Prime Number Assignment");
			
		}
	}

