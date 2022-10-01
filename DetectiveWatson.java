import java.util.Scanner;
import java.util.Arrays;

public class DetectiveWatson {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n, seg;
		
		while(true) {
			n = leitor.nextInt();
			
			if(n==0) {
				break;
			}
			
			int[] vet = new int[n];
			
			for(int i=0;i<n;i++) {
				vet[i]=leitor.nextInt();
			}
			
			int[] vet2 = vet.clone();
			
			Arrays.sort(vet2);
			
			seg = vet2[n-2];
			
			for(int j =0;j<n;j++) {
				if(vet[j]==seg) {
					System.out.println(j+1);
					break;
				}
			}
			
		}

	}

}
