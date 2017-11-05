package newTutor;

import java.util.Scanner;

class basicCalculatorOne {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		double first, second, totalSum, totalMinus, totalProduct, totalDiv, totalRemainder;
		System.out.println("Please enter your first number");
		first = scan.nextDouble();
		System.out.println("Please enter your second number");
		second = scan.nextDouble();
		
		totalSum = first + second;
		System.out.println("The total for Sum of the number " + totalSum);
		totalMinus = first - second;
		System.out.println("The total for Sum of the number " + totalMinus);
		totalProduct = first * second;
		System.out.println("The total for Sum of the number " + totalProduct);
		totalDiv = first /second;
		System.out.println("The total for Sum of the number " + totalDiv);
		totalRemainder = first % second;
		System.out.println("The total for Sum of the number " + totalRemainder);
	}
}













	
	
	
	
	
	
	
	
	
	
	

/*
public static void main(String args[]) {
	Scanner keyboard = new Scanner (System.in);
	double fnumber, snumber, answer;
	
	System.out.println("Please Enter your First number:");
	fnumber = keyboard.nextDouble();
	System.out.println("Please Enter your Second number");
	snumber = keyboard.nextDouble();
	answer = fnumber + snumber;
	System.out.println("Total is " + answer);
	
}
}*/



