import java.util.Scanner;

public class TukTuks {
	public static void main(String[] args){
	
		Scanner leitor = new Scanner(System.in);
		
		int t,c,d;
		long num;
		
		t = leitor.nextInt();
		
		for(int i=0;i<t;i++){
			c = leitor.nextInt();
			d = leitor.nextInt();
			
			if(c==0 && d==0){
				num = 0;
			}else{
				num =(long) Math.pow(26, c)*(long)Math.pow(10, d);
			}
			
			System.out.println(num);
		
		}
		
		
		
	}

}