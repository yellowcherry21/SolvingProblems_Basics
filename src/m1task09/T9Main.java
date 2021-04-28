package m1task09;
import java.util.*;


public class T9Main {
	public static void main(String afr[]) {
		int x1, y1, x2, y2, x3, y3;
		System.out.println("Input (x,y) coordinates of 3 points");
		Scanner scn = new Scanner(System.in);
		x1=scn.nextInt();
		y1=scn.nextInt();
		x2=scn.nextInt();
		y2=scn.nextInt();
		x3=scn.nextInt();
		y3=scn.nextInt();
		scn.close();
		if((x2-x1)/(y2-y1)==(x3-x1)/(y3-y1)) System.out.println("Yes ");	
	}
}
