import java.util.Scanner;

public class TccNatalino{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int e = leitor.nextInt();
		int d = leitor.nextInt();
		
		if(e>d){
		    System.out.println("Eu odeio a professora!");
		}else if(d-e>=3){
		    System.out.println("Muito bem! Apresenta antes do Natal!");
		}else if(d-e<3){
		    System.out.println("Parece o trabalho do meu filho!");
		    if(e+2<24){
		        System.out.println("TCC Apresentado!");
		    }else{
		        System.out.println("Fail! Entao eh nataaaaal!");
		    }
		}
	}
}