package newTutor;

class multipleClassesSub {
	public void simpleMessage() {
		System.out.println("This is another class");
	}
	public void variableOne() {
		int boy = 12;
		int girl = 23;
		if(girl < boy) {
			System.out.println("Girls sucks");
		}else {
			System.out.println("Boy Sucks");
		}
	}
	public void logicalStatement() {
		int girl = 12;
		int boy = 18;
		int cat = 32;
		int dog = 28;
		
		if(dog > cat || boy < girl) {
			System.out.println("Gogo Power rangers");
		}else {
			System.out.println("Powder Puff Girls");
			
		}
	}
	public void switchStatement() {
		int age = 3;
		
		switch (age) {
		case 1:
			System.out.println("Red Sky");
			break;
		case 2:
			System.out.println("Blue Sky");
			break;
		case 3:
			System.out.println("Purple Sky");
			break;
		default:
			System.out.print("No Sky");
			break;
		}
	}
}
