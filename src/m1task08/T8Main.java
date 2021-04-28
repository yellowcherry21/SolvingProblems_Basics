package m1task08;
import java.util.*;
public class T8Main {
	public static void main(String argv[]) {
		int a, b, c, d;
		Scanner scn = new Scanner(System.in);
		a=scn.nextInt();
		b=scn.nextInt();
		c=scn.nextInt();
		d=scn.nextInt();
		scn.close();
		System.out.println(Math.max(Math.min(a, b),Math.min(c, d)));		
	}

}
