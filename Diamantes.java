package exercicios;

import java.util.Scanner;

public class Diamantes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		 int n = leitor.nextInt();
		 String buffer = leitor.nextLine();
		 
		 for(int i=0;i<n;i++){

            String diam = leitor.nextLine();
            int cont = 0;
            diam = diam.replace(".", "");
            
            while (diam.contains("<>")) {
                diam = diam.replaceFirst("\\<>", "");
                cont++;
            }
            if(!diam.contains("<>")){
                System.out.println(cont);
          }    

        }
	}

}