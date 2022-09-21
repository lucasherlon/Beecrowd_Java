import java.util.Scanner;

public class VolumeTv {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int vol, n, op;
		
		vol = leitor.nextInt();
		n = leitor.nextInt();
		
		for(int i=0;i<n;i++) {
			op = leitor.nextInt();
			vol = vol+op;
			if(vol>100) {
				vol=100;
			}
			if(vol<0) {
				vol=0;
			}
		}
		
		System.out.println(vol);
		
	}

}
