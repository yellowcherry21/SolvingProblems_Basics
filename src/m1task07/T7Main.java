package m1task07;

import java.util.*;

public class T7Main {
	public static void main(String argv[]) {
		Scanner scn=new Scanner(System.in);
		int x, y;
		x=scn.nextInt();
		y=scn.nextInt();
		scn.close();
		boolean DoesExist = false;
		boolean IsRight=false;
		if(x+y<180) DoesExist=true;
		if(DoesExist==true&&x+y==90)  IsRight=true;
		if(DoesExist==true&&(x==90||y==90)) IsRight=true;
		System.out.println("Triangle Exists "+DoesExist);
		System.out.println("Triangle is right "+IsRight);
	}

}
