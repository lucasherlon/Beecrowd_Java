import java.util.Scanner;

public class GuerraTerritorio {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n = leitor.nextInt();
		int i;
		int[] num = new int[n];
		int soma=0;
		
		for(i=0;i<n;i++) {
			num[i]=leitor.nextInt();
			soma += num[i];
		}
		
		int terr = soma/2;
		int soma2 = 0;
		
		for(i=0;i<n;i++) {
			soma2 = soma2 + num[i];
			if(soma2==terr) {
				break;
			}
		}
		
		System.out.println(i+1);
	}

}
