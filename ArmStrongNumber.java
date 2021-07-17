package week1.day1;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=153;
		int calculated=0;
		int original=number;
		
		//Step1 remainder 3;quotient 15,number 15,calculated is 27
		
		
		while (number>0) {
			int remainder=number%10;
			int quotient=number/10;
			number=quotient;
			calculated=calculated+(remainder*remainder*remainder);
			//System.out.println(calculated);
		}
if (calculated==original) 
	System.out.println(original+" is an ArmStrong Number");
else
System.out.println(original+" is not an ArmStrong Number");
	}

}
