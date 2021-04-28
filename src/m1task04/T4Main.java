package m1task04;
import java.util.*;

public class T4Main {
	public static void main(String argv[]) {
		Scanner scn= new Scanner(System.in);
		double R;
		System.out.println("Input R :nnn,ddd");
		R=scn.nextDouble();
		scn.close();
		System.out.println(R);
		
		double RC=Math.round(R);
		if(RC>R) RC-=1;
		RC=Math.round(RC);
		System.out.println(R);
		System.out.println(RC);
		double RD=R-RC;
		RD*=1000;
		RD=Math.round(RD);
		System.out.println(RD);
		RC/=1000;
		double RR=RC+RD;
		System.out.println(RR);
				
	}

}
