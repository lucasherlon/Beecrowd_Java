import java.util.Scanner;
import java.util.Arrays;

public class VaiNaSort {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int n;
		
		while(true) {
			int cont=0;
			n = leitor.nextInt();
			if(n==0) {
				break;
			}
			
			int[] vet = new int[n];
			boolean rep = false;
			
			while(!rep) {
				
				for(int i=0;i<n;i++) {
					vet[i]= leitor.nextInt();
				}
				
				int[] vet2 = vet.clone();
			
				Arrays.sort(vet2);
			
				cont++;
				
				if(Arrays.equals(vet, vet2)){
					System.out.println(cont);
					rep=true;
				}
				
			
			}	
		}
		
	}

}
