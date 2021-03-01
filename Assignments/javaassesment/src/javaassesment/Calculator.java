package javaassesment;

class Calculate {
	public int num1 = 0;
	public int num2 = 0;
	public double sum;
	public double product;
	
	
	public double add(int num1, int num2) {
		double sum = this.num1 + this.num2;
		return sum;
	}
	
	public double multiply(int num1, int num2) {
//		double sum = this.add(num1, num2);
		System.out.println(num1 + "" + num2);
		double sum = add(num1, num2);
		double product = sum * this.num1;
		return sum;
	}
}

public class Calculator{
	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.println(c.multiply(10, 5));
		}
}


