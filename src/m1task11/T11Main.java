package m1task11;
import java.util.*;

public class T11Main {
	public static void main(String aosdfgi[]) {
		double x, Fx;
		Scanner scn = new Scanner(System.in);
		x=scn.nextDouble();
		scn.close();
		if(x<=3) {
			Fx=x*x-3*x+9;
		}
		else {
			Fx=1/(x*x*x+6);
		}
		System.out.println(Fx);
	}

}
