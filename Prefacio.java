import java.util.Scanner;

public class Prefacio {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		 
		int a = leitor.nextInt();
		int b = leitor.nextInt();
		 
		 if(a==0) {
			 System.out.printf("0 0");
		 }else if(a>0) {
			 for(int r=0; r<=Math.abs(b);r++) {
				 for(int q = -a; q<=a; q++) {
					 if((a-r) == (b*q)) {
						 System.out.printf("%d %d", q, r);
					 }
					 
				 }
			 }
		 }else {
			 for(int r=0; r<=Math.abs(b);r++) {
				 for(int q = a; q<=-a; q++) {
					 if((a-r) == (b*q)) {
						 System.out.printf("%d %d", q, r);
					 }
					 
				 }
			 }
			 
		 }
	}

}
