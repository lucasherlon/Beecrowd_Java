import java.util.Scanner;

public class HorasMinutos {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x;
		
		while(leitor.hasNextInt()) {
			x = leitor.nextInt();
			
			if(x%6==0) {
				System.out.println("Y");
			}else {
				System.out.println("N");
			}
		}
	}

}
