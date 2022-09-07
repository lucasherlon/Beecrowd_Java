import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		while(true){
    		int a = leitor.nextInt();
    		if(a==0){
    		    break;
    		}
    		int b = leitor.nextInt();
    		int perc = leitor.nextInt();
    		
    		int area = (a*b*100)/perc;
    		
    		int lado = (int)Math.sqrt(area);
    		System.out.println(lado);
		
		}
	}
}