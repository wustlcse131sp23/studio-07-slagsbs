package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction (int a,int b) {
		numerator = a;
		denominator = b;
	}
	
	public Fraction getSum (Fraction f) {
		return Fraction sum=new Fraction (this.numerator+f.numerator,this.denominator); 
	}
	
	
	
}
