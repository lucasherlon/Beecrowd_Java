package exercicios;
import java.util.Scanner;

public class Lap {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int x = leitor.nextInt();
		int y = leitor.nextInt();
		
		double s1=0,s2=0, dist=0,n;
		int t=0;
		
		while(dist<100) {
			
			s1 += (double)100/x;
			s2 += (double)100/y;
			dist = s1-s2;
			t++;
		}
		
		n = Math.round((double)t/x);
		
		System.out.printf("%.0f\n", n);
		
	}

}
