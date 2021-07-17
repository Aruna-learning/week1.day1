package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		int fact=1;
		
		for (int inum=1;inum<=i;inum++)
		{
			fact=fact*inum;	
		}
		System.out.println("The factorial value of "+i+" = "+fact);
}
		

}
