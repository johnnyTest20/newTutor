package newTutor;

class nestedIfStatement {
	public static void main(String args[]) {
		int age = 60;
		
		if(age < 50) {
			System.out.println("You are young");
		}else {
			System.out.println("You are old");
			if(age > 75) {
				System.out.println("You are very old");
			}else{
				System.out.println("Dont worry you are not that old");
			}
		}
	}

}
