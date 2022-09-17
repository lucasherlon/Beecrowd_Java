import java.util.Scanner;

public class Formiguinha {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int t = leitor.nextInt();
		int n;
		
		for(int i=0;i<t;i++) {
			n = leitor.nextInt();
			System.out.println((n+1)/2);
		}
	}

}
