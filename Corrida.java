import java.util.Scanner;

public class Corrida {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double t1,t2;
		
		int[] crt1 = new int[3];
		int[] crt2 = new int[3];
		
		for(int i=0;i<crt1.length;i++) {
			crt1[i]=leitor.nextInt();
		}
		
		for(int i=0;i<crt2.length;i++) {
			crt2[i]=leitor.nextInt();
		}
		
		t1 = (double)crt1[1]/crt1[2];
		t2 = (double)crt2[1]/crt2[2];
		
		if(t1<t2) {
			System.out.println(crt1[0]);
		}else {
			System.out.println(crt2[0]);
		}
	}

}
