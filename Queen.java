package exercicios;
import java.util.Scanner;

public class Queen {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int x1,y1,x2,y2;
		int deltax, deltay, mov;
		
		while(true) {
			
			x1 = leitor.nextInt();
			y1 = leitor.nextInt();
			x2 = leitor.nextInt();
			y2 = leitor.nextInt();
			
			if(x1==0 && x2==0 && y1==0 && y2==0) {
				break;
			}
			
			deltax = Math.abs(x2-x1);
			deltay = Math.abs(y2-y1);
			
			if(x1==x2 && y1==y2) {
				mov = 0;
			}else if(deltay==deltax || x1==x2 || y1==y2) {
				mov = 1;
			}
			else{
				mov = 2;
			}
			
			System.out.println(mov);
		}
	}

}
