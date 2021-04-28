package m1task03;
import java.util.*;

public class T3Main {
	public static void main(String argv[]) {
		Scanner scn = new Scanner(System.in);
		double x, y;
		x=scn.nextDouble();
		y=scn.nextDouble();
		scn.close();
		double n=(Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y));
		double nn=n*Math.tan(x*y);
		System.out.println(nn);

	}

}
