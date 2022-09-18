import java.util.Scanner;

public class BibliotecaPascal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n,d,i,j, cont;
		boolean ver;
		
		while(true) {
			n = leitor.nextInt();
			d = leitor.nextInt();
			
			if(n==0 && d==0) {
				break;
			}
			
			int[][] matriz = new int[d][n];
			cont = 0;
			
			
			for(i=0;i<d;i++) {
				for(j=0;j<n;j++) {
						matriz[i][j] = leitor.nextInt();
				}
			}
			
			for(j=0;j<n;j++) {
					ver = true;
					for(i=0;i<d;i++) {
						if(matriz[i][j]==0) {
							ver = false;
						}
					}
					if(ver==true) {
						cont++;
					}
				}
				
			
			
			if(cont>0) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}

	}
}
