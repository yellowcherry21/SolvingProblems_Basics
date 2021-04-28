package m1task13;
import java.util.*;

public class T13Main {
	public static void main(String fgjkld[]) {
		int A, B, h, y=0, x = 0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Input [A,B] and h");
		A=scn.nextInt();
		B=scn.nextInt();
		h=scn.nextInt();
		scn.close();
		if(B<=A); 
		int n=Math.abs((B-A))/h;
		System.out.println("amount is"+n);
		for(int i=0;i<n;i++) {
			x=A+i*h;
			System.out.print("x is "+x+"\t");
			if(x>2) y=x;
			if(x<=2) y=-x;
			System.out.println("Y is "+y);
		}
	}

}
