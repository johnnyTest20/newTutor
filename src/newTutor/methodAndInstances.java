package newTutor;

import java.util.Scanner;

class methodAndInstances {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		methodAndInstanceSub subThreeObject = new methodAndInstanceSub();
		
		System.out.println("Enter name here: ");
		String temp = input.nextLine();
		subThreeObject.setName(temp);
		subThreeObject.saying();
		
		
	}
}
















/*
package newTutor;

import java.util.Scanner;

class methodAndInstances {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		methodAndInstanceSub subThreeObject  = new methodAndInstanceSub();
		
		System.out.println("Enter your name of first girlfriend: ");
		String temp = input.nextLine();
		subThreeObject.setName(temp);
		subThreeObject.saying();
		
	}

}
*/