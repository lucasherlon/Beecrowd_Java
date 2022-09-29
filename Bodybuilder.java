import java.util.Scanner;

public class Bodybuilder {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double m,w,media,soma=0; 
		int  w1,w2, r, cont=0;
		
		while(true) {
			
			w1 = leitor.nextInt();
			w2 = leitor.nextInt();
			r = leitor.nextInt();
			
			if(w1==0 && w2==0 && r==0) {
				break;
			}
			
			w = (double)(w1+w2)/2;

			m = w*(1+((double)r/30));
			
			cont++;
			soma = soma + m;
			
			if(m>=1 && m<13) {
				System.out.println("Nao vai da nao");
			}else if(m>=13 && m<14) {
				System.out.println("E 13");
			}else if(m>=14 && m<40) {
				System.out.println("Bora, hora do show! BIIR!");
			}else if(m>=40 && m<=60) {
				System.out.println("Ta saindo da jaula o monstro!");
			}else {
				System.out.println("AQUI E BODYBUILDER!!");
			}
			
			
		}
		
		media = soma/cont;
		
		if(media >40) {
			System.out.println();
			System.out.println("Aqui nois constroi fibra rapaz! Nao e agua com musculo!");
		}

	}

}
