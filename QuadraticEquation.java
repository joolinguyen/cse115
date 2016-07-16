package Day4;

public class QuadraticEquation {
	
	private double a, b, c;
	
	public QuadraticEquation(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double geta(){
		return a;
	}
	public double getb(){
		return b;
	}
	public double getc(){
		return c;
	}
	
	public double getDiscriminant(){
		return ((b*b)-(4*a*c));
	}
	
	public double getRoot1(){
		return ((-b + Math.sqrt(((b*b)-(4*a*c))))/2*a);
	}
	public double getRoot2(){
		return ((-b - Math.sqrt(((b*b)-(4*a*c))))/2*a);
	}
}
