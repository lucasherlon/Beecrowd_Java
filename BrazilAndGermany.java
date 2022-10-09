package exercicios;

import java.util.Scanner;

public class BrazilAndGermany {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		long min, bra, ger;
		
		while(true) {
			
			min = leitor.nextLong();
			if(min==0) break;
			
			ger = (long)Math.ceil(min*(7.0/90.0));
			bra = (long)Math.floor(min*(1.0/90.0));
			
			System.out.println("Brasil "+bra+" x Alemanha "+ger);
			
			
		}
	}

}
