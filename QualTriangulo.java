import java.util.Scanner;

public class QualTriangulo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int a = leitor.nextInt();
		int b = leitor.nextInt();
		int c = leitor.nextInt();
		
		if((a>=b+c) || (b>=a+c) || (c>=a+b)) {
			System.out.println("Invalido");
		}else {
			if(a==b && b==c) {
				System.out.println("Valido-Equilatero");
				System.out.println("Retangulo: N");
			}else if((a==b && b!=c) || (b==c && c!=a) || (a==c && a!=b)) {
				System.out.println("Valido-Isoceles");
				if((a*a==b*b+c*c) || (b*b == a*a+c*c) || (c*c==a*a+b*b) ) {
					System.out.println("Retangulo: S");
				}else {
					System.out.println("Retangulo: N");
				}
			}else {
				System.out.println("Valido-Escaleno");
				if((a*a==b*b+c*c) || (b*b == a*a+c*c) || (c*c==a*a+b*b) ) {
					System.out.println("Retangulo: S");
				}else {
					System.out.println("Retangulo: N");
				}
			}
		}
		
	}

}
