package m1task06;
import java.util.*;

public class T6Main {
	public static void main(String argv[]) {
		Scanner scn= new Scanner(System.in);
		double x, y;
		System.out.println("Input x and y: ");
		x=scn.nextDouble();
		y=scn.nextDouble();
		scn.close();
		boolean flag=false;
		if(x>=-2&&x<=2&&y<=4&&y>=0) flag=true;
		if(x>=-4&&x<=4&&y>=-3&&y<=0) flag=true;
		System.out.println(flag);
	}

}
