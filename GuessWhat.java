package exercicios;
import java.util.Scanner;

public class GuessWhat {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n = leitor.nextInt();
		
		for(int i=0;i<n;i++) {
			
			int qt = leitor.nextInt();
			int s = leitor.nextInt();
			
			int[] student = new int[qt];
		
			for(int j=0;j<qt;j++) {
				student[j] = leitor.nextInt();
				
			}
			
			int ind = 0;
			
			for(int j=0;j<qt;j++) {
				if(student[j]==s) {
					ind = j+1;
					break;
				}
			}
			
			int dif = 0;
			if(ind==0) {
				for(int k=0;k<qt;k++) {
					if(k==0) {
						dif = Math.abs(student[k]-s);
						ind =k+1;
					}else {
						if(Math.abs(student[k]-s) < dif ) {
							dif = Math.abs(student[k]-s);
							ind = k+1;
							
						}
					}
					
				}
				
			}
			
			System.out.println(ind);
			
			
		}

	}

}
