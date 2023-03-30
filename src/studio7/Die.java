package studio7;

public class Die {

	private int n;
	
	public Die (int a) {
		n=a;
	}
	
	public int thrown() {
		return (int)(Math.random()*n+1);
	}
	
	public static void main(String[] args) {
		Die d1=new Die (8);
		System.out.println(d1.thrown());
	}
	
	
	

}
