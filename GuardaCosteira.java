import java.util.Scanner;

public class GuardaCosteira {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int d, vf, vg;
		double t1,t2, dpc;
		while(leitor.hasNextInt()) {
			
			d = leitor.nextInt();
			vf = leitor.nextInt();
			vg = leitor.nextInt();
			
			if(vf>=vg) {
				System.out.println("N");
			}else {
				dpc = Math.sqrt(Math.pow(d, 2)+Math.pow(12, 2));
				
				t1 = 12/(double)vf;
				t2 = dpc/vg;
				
				if(t2<=t1) {
					System.out.println("S");
				}else {
					System.out.println("N");
				}
				
			}
			
			
		}
		
	}

}
