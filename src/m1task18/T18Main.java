package m1task18;
import java.util.*;

public class T18Main {
	public static void main(String dfgilk[]) {
		System.out.println("input [m,n], m>0, n>m");
		Scanner scn = new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		scn.close();

		
		///int N=n-m;
		for(int i=m;i<=n;i++) {
			int d=0;
			System.out.println("i is :"+i+"\t");
			for(int j=2;j<=(i/2);j++) {
				if(i%j==0) {
					d=j;
					System.out.println("Divider is : "+d);
				}
			}if(d==0) System.out.println(i+" is prime");
			
		}
		
		/*for(int i=2;i<=(k/2);i++) {                    Делители числа.			
			if(k%i==0) {
				d=i;
				System.out.println(d);
			}
		}
		if(d==0) System.out.println("k is prime");*/
		
		
	}


}
