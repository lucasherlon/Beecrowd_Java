package exercicios;

import java.util.Scanner;

public class SantasTranslator {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		while(leitor.hasNextLine()) {
			String country = leitor.nextLine();
			
			if (country.equals("brasil") || country.equals("portugal")) {
				System.out.println("Feliz Natal!");
			} else if (country.equals("alemanha")) {
				System.out.println("Frohliche Weihnachten!");
			} else if (country.equals("austria")) {
				System.out.println("Frohe Weihnacht!");
			} else if (country.equals("coreia")) {
				System.out.println("Chuk Sung Tan!");
			} else if (country.equals("espanha") || country.equals("argentina") ||
					country.equals("chile") || country.equals("mexico")) {
				System.out.println("Feliz Navidad!");
			} else if (country.equals("grecia")) {
				System.out.println("Kala Christougena!");
			} else if (country.equals("estados-unidos") || country.equals("australia") ||
					country.equals("inglaterra") || country.equals("antardida") ||
					country.equals("canada")) {
				System.out.println("Merry Christmas!");
			} else if (country.equals("suecia")) {
				System.out.println("God Jul!");
			} else if (country.equals("turquia")) {
				System.out.println("Mutlu Noeller");
			} else if (country.equals("irlanda")) {
				System.out.println("Nollaig Shona Dhuit!");
			} else if (country.equals("belgica")) {
				System.out.println("Zalig Kerstfeest!");
			} else if (country.equals("italia") || country.equals("libia")) {
				System.out.println("Buon Natale!");
			} else if (country.equals("siria") || country.equals("marrocos")) {
				System.out.println("Milad Mubarak!");
			} else if (country.equals("japao")) {
				System.out.println("Merii Kurisumasu!");
			} else {
				System.out.println("--- NOT FOUND ---");
			}
		}

	}

}
