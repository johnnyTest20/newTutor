package newTutor;

class switchStatementOne {
	public static void main (String args[]) {
		int age;
		age = 10;
		
		switch (age) {
		case 1:
			System.out.println("You can Crawl");
			break;
		case 2:
			System.out.println("You can Talk");
			break;
		case 3:
			System.out.println("You can get in trouble");
			break;
		default:
			System.out.println("I dont know how old you are");
			break;
		}
	}

}
