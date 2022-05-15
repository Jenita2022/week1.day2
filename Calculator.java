package week1.day2;

public class Calculator {

	public int add(int num1, int num2, int num3){
		int sum= num1+num2+num3;
		return sum;
	}
	public int sub(int num1, int num2){
		int Diff = num1-num2;
		return Diff;
	}
	public double mul(double num1, double num2){
		double product= num1*num2;
		return product;
	}
	public float div(float num1, float num2){
		float divResult = num1/num2;
		return divResult;
	}
	
	public static void main(String[] args) {
		Calculator Cal = new Calculator();
		System.out.println(Cal.add(15, 10, 2));
		System.out.println(Cal.sub(100, 25));
		System.out.println(Cal.mul(1567.10, 105.23));
		System.out.println(Cal.div(20.35F,2.50F));
	}

}
