import java.util.Scanner;

public class Galopeira{
	public static void main(String[] args){
		
		Scanner leitor = new Scanner(System.in);
		String galopeira = new String();
		double tempo;
		int tam;
		
		int c = leitor.nextInt();
		
		for(int i=0;i<c;i++){
		    
		    galopeira = leitor.next();
		    tam = galopeira.length();
		    tempo = tam*0.01;
		    
            System.out.printf("%.2f%n", tempo);

		}
	}
}