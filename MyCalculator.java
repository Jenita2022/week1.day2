package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		System.out.println("Sum: " + myCal.add(150, 100, 30));
		System.out.println("Diff: " + myCal.sub(250, 30));
		System.out.println("Product: " + myCal.mul(2450.32, 1009.89));
		System.out.println("Division: " + myCal.div(56.45F, 4.33F));
     	}

}
