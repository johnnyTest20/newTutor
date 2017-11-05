package newTutor;

import java.util.Scanner;

public class userInputTest {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String fName;
		String lName;
		String password;
		
		System.out.println("What is your First Name");
		fName = keyboard.nextLine();
		System.out.println("What is your Last Name");
		lName = keyboard.nextLine();
		System.out.println("What is your password");
		password = keyboard.nextLine();
		
		System.out.println("Hey " + fName +" " + lName);
		System.out.print("You just told Stranger your password is " + password);
		if(keyboard != null) {
			keyboard.close();
		}
	}
}
