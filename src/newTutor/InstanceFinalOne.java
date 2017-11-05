package newTutor;

public class InstanceFinalOne {
	public static void main(String args[]) {
		InstanceFinalSubOne subOne = new InstanceFinalSubOne(25);
		
		for(int z =0; z <10; z++) {
			subOne.add();
			System.out.printf("%s", subOne);
		}
	}
}
































/*public static void main(String args[]) {
	InstanceFinalSubOne subOne = new InstanceFinalSubOne(10);
	
	for(int i = 0; i < 5; i++) {
		subOne.add();
		System.out.printf("%s", subOne);
	}
	
}*/