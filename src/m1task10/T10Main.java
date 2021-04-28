package m1task10;
import java.util.*;
public class T10Main {
	public static void main(String asdr[]) {
		Scanner scn=new Scanner(System.in);
		int A, B, x , y, z;
		A=4;B=7;
		x=scn.nextInt();
		y=scn.nextInt();
		z=scn.nextInt();
		scn.close();
		boolean flag=false;
		if((x<=A&&y<=B)||(x<=A&&z<=B)||(y<=A&&x<=B)||(y<=A&&z<=B)||(z<=A&&x<=B)||(z<=A&&y<=B)){
			flag=true;
		}
		System.out.println(flag);
	}

}
