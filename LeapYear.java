package exercicios;
import java.util.Scanner;
import java.math.BigInteger;

public class LeapYear {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		BigInteger quatro = new BigInteger("4");
		BigInteger cem = new BigInteger("100");
		BigInteger cincinc = new BigInteger("55");
		BigInteger quinze = new BigInteger("15");
		BigInteger quatroc = new BigInteger("400");
		BigInteger zero = new BigInteger("0");
		
		boolean flag = false;
		
		while(leitor.hasNextBigInteger()) {
			
			if(flag) {
				 System.out.println();
			}
			
			BigInteger ano = leitor.nextBigInteger();
			
			flag = true;
			
			if((ano.remainder(quatro).equals(zero) && !ano.remainder(cem).equals(zero)) || ano.remainder(quatroc).equals(zero)) {
				System.out.println("This is leap year.");
				
				if(ano.remainder(quinze).equals(zero)) {
					System.out.println("This is huluculu festival year.");
				}
				
				if(ano.remainder(cincinc).equals(zero)) {
					System.out.println("This is bulukulu festival year.");
				}
			}else if(ano.remainder(quinze).equals(zero)) {
				System.out.println("This is huluculu festival year.");
			}else {
				System.out.println("This is an ordinary year.");
			}
			
			
			
		}
	}

}
