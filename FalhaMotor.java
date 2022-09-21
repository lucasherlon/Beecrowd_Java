import java.util.Scanner;

public class FalhaMotor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n = leitor.nextInt();
		int[] vel = new int[n];
		int res;
		
		for(int i=0;i<n;i++) {
			vel[i]=leitor.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(i>0) {
				if(vel[i]<vel[i-1]) {
					res=i+1;
					System.out.println(res);
					System.exit(0);
				}
			}
		}
		
		System.out.println(0);
		
	}

}
