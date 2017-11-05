package newTutor;

public class constructorOneSub {
	private String girlName;
	private String age;
	private String city;
	
	public constructorOneSub(String g, String a, String c) {
		girlName = g;
		age = a;
		city = c;
	}
	public  String getGirlName(){
		return girlName;
	}
	public String getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	public void saying() {
		System.out.printf(" Her name is %s and she was %s years old and she lived in %s \n", getGirlName(), getAge(),getCity());
	}
}














/*private String girlName;

public constructorOneSub(String name) {
	girlName = name;
	
}

public void setName(String name) {
	girlName = name;
	
}
public String getName() {
	return girlName;
}
public void saying() {
	System.out.printf("Your first girlfriend was %s", getName());
	
}*/