package m1task16;
import java.util.*;
public class T16Main {
	public static void main(String dfg[]) {
		double e;
		Scanner scn = new Scanner(System.in);
		e=scn.nextDouble();
		scn.close();
		int n=1;
		double Summ=0;
		double An=Math.pow(3, -n)+Math.pow(0.5, n);
		while(An>=e) {
			An=Math.pow(3, -n)+Math.pow(0.5, n);
			Summ+=An;
			n++;
			System.out.println("e is: "+e+" An is: "+An+" n is: "+n+" Summ is: "+Summ);
		}		
	}
}
