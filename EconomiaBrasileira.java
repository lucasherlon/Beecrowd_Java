import java.util.Scanner;

public class EconomiaBrasileira {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int q =leitor.nextInt();
		int soma = 0;
		
		for(int i=0;i<q;i++) {
			soma = soma + leitor.nextInt();
		}
		if(q%2==0) {
			if(soma>=(q/2)) {
				System.out.println("N");
			}else {
				System.out.println("Y");
			}
		}else {
			if(soma>(q/2)) {
				System.out.println("N");
			}else {
				System.out.println("Y");
			}
		}
	}
	
}
