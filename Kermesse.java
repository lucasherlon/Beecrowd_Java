import java.util.Scanner;

public class Kermesse {
	
	public static void main(String[] args){
		
		Scanner leitor = new Scanner(System.in);
		int cont=0;
		
		while(true){
		
			int n = leitor.nextInt();
			if(n==0) break;
			cont++;
			
			int[] vet = new int[n];
			
			for(int i=0;i<n;i++){
				vet[i] = leitor.nextInt();
			}
			
			for(int i=0;i<n;i++){
				if(vet[i]==i+1){
					
					System.out.println("Teste "+cont);
					System.out.println(vet[i]);
					System.out.println();
					break;
				}
			}
		}
	
	}
}