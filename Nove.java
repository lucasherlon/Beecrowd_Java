import java.util.Scanner;

public class Nove {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int t = leitor.nextInt();
		
		for(int i=0;i<t;i++) {
			
			long n = leitor.nextLong();
			
			if(n%2==0) {
				System.out.println("1");
			}else {
				System.out.println("9");
			}
		
			
		}
		
	}

}
