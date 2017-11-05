package newTutor;

class logicalOperatorOneTest {
	public static void main(String args[]) {
		int boy = 20;
		int girl = 40;
		int cat = 50;
		int dog = 30;
		
		if(dog > cat && girl > boy) {
			System.out.println("you can Enter");
		}else {
			System.out.println("You cannot Enter");
		}if(dog > cat || girl > boy) {
			System.out.println("You can enter");
		}else {
			System.out.println("You cannot Enter");
		}
	}

}
