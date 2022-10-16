package exercicios;

import java.util.Scanner;

public class Telescopio {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int aberturaTelescopio = leitor.nextInt();
		int numeroEstrelas = leitor.nextInt();
		int fotons;
		int cont = 0;
		
		for(int i=0;i<numeroEstrelas;i++) {
			fotons = leitor.nextInt();
			if (fotons*aberturaTelescopio >= 40000000) {
				cont++;
			}
		}
		
		System.out.println(cont);
		
		
	}

}
