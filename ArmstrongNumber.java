package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int input = 153;
		int initialInput =input;
		int aSum = 0;
		
		while (input > 0) {
		int rem = input%10;
		aSum = aSum + (rem*rem*rem);
		input = input/10;   
	}
    System.out.println(aSum);
    
    if (aSum == initialInput)
    	System.out.println("Armstrong number");
    else
    	System.out.println("Not an Armstrong no");
}
	
}