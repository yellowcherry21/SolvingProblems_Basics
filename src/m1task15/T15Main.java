package m1task15;

public class T15Main {
	public static void main(String aser[]) {
		double Mult=1L;
		System.out.println(Mult);
		for(int i = 1;i<200;i++) {
			Mult*=i*i;
			if(i>=198) {
				System.out.println("i is: "+i+" Meaning is"+Mult);
			}
		}
		System.out.println(" Meaning is"+Mult);
	}

}
