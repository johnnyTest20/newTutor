package newTutor;

import java.util.Scanner;

class methodWithParameters{
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		methodWithParametersSub subTwoObject = new methodWithParametersSub();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		subTwoObject.simpleMessage(name);
		
		
	}
	
}
