import java.util.Scanner;

public class SomaNatural{
	public static void main(String[] args){
	    Scanner leitor = new Scanner(System.in);
	    
		long a;
		long b;
		long dif;
		long soma;
		
		a = leitor.nextLong();
		b = leitor.nextLong();
		
		if(a>b){
		    dif = (a-b)+1;
		    soma = ((a+b)*dif)/2;
		    System.out.println(soma);
		}else if(a<b){
		    dif=(b-a)+1;
		    soma = ((a+b)*dif)/2;
		    System.out.println(soma);
		}else{
		    soma = a;
		    System.out.println(soma);
		}
		
		
	}
}