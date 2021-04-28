package m1task19;
import java.util.*;

public class T19Main {
	public static void main(String ghghklf[]) {
		System.out.println("Input n;m, n>m");
		Scanner scn = new Scanner(System.in);
		int m=scn.nextInt(), k=0, n=0, k1=0, n1=0, m1=scn.nextInt();
		n=m;n1=m1;
		scn.close();
		while(m>=1) {
			m/=10;
			k++;
		}
		while(m1>=1) {
			m1/=10;
			k1++;
		}
		
		boolean []used=new boolean[Math.max(k1, k)]; 
		int []ar=new int[k];
		int []ar1=new int[k1];
		//int []ar2=new int[k];
		
		for(int i=0;i<k;i++) {
			ar[i]=n%10;
			n/=10;			
			
			System.out.print(ar[i]+",");
			
			used[i]=false;			
		}
		
		System.out.println();
		
		for(int j=0;j<k1;j++) {
			ar1[j]=n1%10;
			n1/=10;
			used[j]=false;
			System.out.print(ar1[j]+",");
		}
		
		System.out.println();
		
		for(int i=0;i<k;i++) {
			for(int j=0;j<k1;j++) {
				if(ar[i]==ar1[j]) {
					used[j]=true;
					break;
				}
			}
		}
		
		System.out.println();
		
		for(int i =0;i<k1;i++) {
			if(used[i]==true) {
				System.out.print(ar1[i]+"  ");
			}
		}
	}

}
