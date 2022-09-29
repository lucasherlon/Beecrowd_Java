import java.util.Scanner;

public class DecoraORole {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		double area, raio, preco;
		
		int n = leitor.nextInt();
		
		for(int i=0;i<n;i++) {
			area = leitor.nextDouble();
			raio = Math.sqrt(area/12.56);
			
			if(raio < 12) {
				preco = area*0.09;
				System.out.printf("vermelho = R$ %.2f\n", preco);
			}else if(raio >= 12 && raio <= 15) {
				preco = area*0.07;
				System.out.printf("azul = R$ %.2f\n", preco);
			}else {
				preco = area*0.05;
				System.out.printf("amarelo = R$ %.2f\n", preco);
			}
			
			
		}
	}

}
