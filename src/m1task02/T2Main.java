package m1task02;

public class T2Main {
	public static void main(String argv[]) {
		double a, b, c;
		a=4.5;
		b=6.45;
		c=3.67;
		
		double x=(b+Math.sqrt(b*b+4*a*c))/(2*a)-a*a*a*c+1/(b*b);
		System.out.println(x);
		
	}

}
