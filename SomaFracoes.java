import java.util.Scanner;

public class SomaFracoes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int a = leitor.nextInt();
		int b = leitor.nextInt();
		int c = leitor.nextInt();
		int d = leitor.nextInt();
		
		int num, den, aux, aux2;
		
		den = b*d;
		num = d*a + b*c;
		aux = num;
		aux2 = den;
		
		
		if(aux==aux2) {
			System.out.printf("1 1\n");
			
		}else if(aux<aux2) {
			
			for(int i = 2; i<=aux/2;i++) {
				if(den%i==0 && num%i==0) {
					while(den%i==0 && num%i==0) {
						den = den/i;
						num = num/i;
				    
					}
						
				}
			}
			
			System.out.printf("%d %d\n", num, den);
		}else {
			
			for(int i = 2; i<=aux2/2;i++) {
				if(den%i==0 && num%i==0) {
					while(den%i==0 && num%i==0) {
						den = den/i;
						num = num/i;
					}
				}
			}
			
			System.out.printf("%d %d\n", num, den);
		}
    }

}
