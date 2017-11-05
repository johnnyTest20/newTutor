package newTutor;

class incrementsOperatorTest {
	public static void main(String args[]) {
		int boy =12;
		int girl = 15;
		int cat = 20;
		int dog = 18;
		
		boy +=10;
		girl+=12;
		cat--;
		dog++;
		
		if(boy < girl) {
			System.out.println("There are more girls in the classroom");
		}else {
			System.out.println("There are more boys in the classroom");
		}
		if(cat < dog) {
			System.out.println("There are more dogs in the pet hotel");
		}else {
			System.out.println("There are more cats in the pet hotel");
		}
	}
}


































/*
public static void main(String args[]) {
	int boys = 8;
	int girls = 12;
	int dogs = 15;
	int cats = 5;
	
	boys += 10;
	girls -= 10;
	++cats;
	--dogs;
	
	System.out.print("Total amount of boys are ");
	System.out.println(boys);
	System.out.print("Total amount of girls are ");
	System.out.println(girls);
	System.out.print("Total amount of dogs are ");
	System.out.println(dogs);
	System.out.print("Total amount of cats are ");
	System.out.println(cats);
}*/