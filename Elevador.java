import java.util.Scanner;

public class Elevador {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n, cap;
		int ent, sai, acm=0;
		boolean ver = false;
		
		n = leitor.nextInt();
		cap = leitor.nextInt();
		
		for(int i=0;i<n;i++) {
			sai = leitor.nextInt();
			ent = leitor.nextInt();
			
			acm -= sai;
			acm += ent;
			
			if(acm>cap) {
				ver=true;
			}
			
		}
		
		if(ver) {
			System.out.println("S");
		}else {
			System.out.println("N");
		}
		
		
	}

}
