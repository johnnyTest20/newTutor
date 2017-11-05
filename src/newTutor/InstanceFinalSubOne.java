package newTutor;

public class InstanceFinalSubOne {
	private int sum;
	private final int NUM;
	
	public InstanceFinalSubOne(int x) {
		NUM = x;
	}
	public void add(){
		sum += NUM;
	}
	public String toSting() {
		return String.format("Sum  = %d \n", sum);
	}
}



























/*private int sum;
private final int NUMBER;

public InstanceFinalSubOne(int x) {
	NUMBER =x;
}
public void add() {
	sum += NUMBER;
}
public String toString() {
	return String.format("sum = %d\n", sum);

}*/