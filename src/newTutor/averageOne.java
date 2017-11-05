package newTutor;

import java.util.Scanner;

class averageOne{
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	int total = 0;
	int average;
	int grade;
	int counter = 0;
	
	while(counter < 10) {
		grade = input.nextInt();
		total = total + grade;
		counter++;
		}
	average = total/10;
	System.out.println("Your total average is " + average);
	if (average > 70) {
		System.out.println("You have Passed this Subject");
	}else if (average == 70) {
		System.out.println("You are in the boarderline");
	}else if(average < 70) {
		System.out.println("You have failed this subject");
	}else {
		System.out.println("You must be really smart or dumb");
		}
	}
}

































/*import java.util.Scanner;

class averageOne {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int average;
		int counter = 0;
		
		while(counter < 10) {
		grade = input.nextInt();
		total = total + grade;
		counter++;
				
		}
		average = total/10;
		System.out.println("Your average is " + average);
		if(average > 6) {
			System.out.println("You have passed this subject.");
		}else if(average == 6){
			System.out.println("You are on the boarder line");	
		}else {
			System.out.println("You failed this subject.");
		}
	}
}*/

/*class averageOne {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int average;
		int counter = 0;
		
		while (counter < 10) {
			grade = input.nextInt();
			total = total + grade;
			counter++;
			
		}
		average = total/10;
		System.out.println("Your average is " + average);
	}
	

}*/