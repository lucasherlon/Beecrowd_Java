package exercicios;

import java.util.Scanner;

public class SearchingSubsequences {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String num1 = new String();
		String num2 = new String();
		int cont, pos, caso=0;
		
		while(leitor.hasNext()) {
			
			num1 = leitor.next();
			num2 = leitor.next();
			
			cont=0;
			caso++;
			
			if(num2.contains(num1)) {
				pos = num2.lastIndexOf(num1);
				
				while(num2.contains(num1)) {
					num2 = num2.replaceFirst(num1,"");
					cont++;
				}
				
				System.out.printf("Caso #%d:\n", caso);
				System.out.printf("Qtd.Subsequencias: %d\n", cont);
				System.out.printf("Pos: %d\n", pos+1);
				System.out.println();
			}else {
				System.out.printf("Caso #%d:\n", caso);
				System.out.printf("Nao existe subsequencia\n");
				System.out.println();
			}
			
			
		}
		
		
	}

}
