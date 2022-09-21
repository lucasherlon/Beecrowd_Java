import java.util.Scanner;

public class BatalhaPokemon {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double valorGolpe1, valorGolpe2 ;
		int bonus, bonus1, bonus2;
		
		int[] vet1 = new int[3];
		int[] vet2 = new int[3];
		
		int n = leitor.nextInt();
		
		for(int i=0;i<n;i++) {
			
			bonus = leitor.nextInt();
			
			for(int j=0;j<3;j++) {
				vet1[j]=leitor.nextInt();
			}
			
			if(vet1[2]%2==0) {
				bonus1 = bonus;
			}else {
				bonus1=0;
			}
			
			for(int j=0;j<3;j++) {
				vet2[j]=leitor.nextInt();
			}
			
			if(vet2[2]%2==0) {
				bonus2 = bonus;
			}else {
				bonus2=0;
			}
			
			valorGolpe1 = ((vet1[0]+vet1[1])/2.0)+bonus1;
			valorGolpe2 = ((vet2[0]+vet2[1])/2.0)+bonus2;
			
			if(valorGolpe1>valorGolpe2) {
				System.out.println("Dabriel");
			}else if(valorGolpe2>valorGolpe1) {
				System.out.println("Guarte");
			}else {
				System.out.println("Empate");
			}
			
		}
		
		}

}
