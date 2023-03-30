package studio7;

public class Rectangle {

	private int width;
	private int length;

	public Rectangle (int a, int b) {
		width = a;
		length = b;

	}
	public double getArea () {
		double area=width*length;
		return area;
	}
	public double getP() {
		double p = 2*(width+length);
		return p;
	}
	public boolean compare(Rectangle r) {

		return this.getArea()<r.getArea();

	}

	public boolean square() {
		return width==length;
	}
		

	public static void main(String[] args) {
		Rectangle r1=new Rectangle (3,6);
		System.out.println(r1.getArea());
		Rectangle r2=new Rectangle (7,8);
		System.out.println(r1.compare(r2));
	}


}

