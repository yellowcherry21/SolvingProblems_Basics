package m1task05;
import java.util.*;

public class T5Main {
	public static void main(String argv[]) {
		int Time, H, M, S;
		@SuppressWarnings("resource")
		Scanner scn=new  Scanner(System.in);
		Time=scn.nextInt();
		H=Time/3600;
		Time=Time-3600*H;
		M=Time/60;
		Time=Time-60*M;
		S=Time;
		System.out.println(H+"ч "+M+"мин "+S+"с.");
		
	}

}
