import java.util.Scanner;

public class Loteria {

	public static void main(String[] args){
	
	Scanner leitor = new Scanner(System.in);

	int[] aposta = new int[6];
	int[] sorteio = new int[6];

	for(int i=0; i<aposta.length;i++){
		aposta[i] = leitor.nextInt();
	
	}
	
	for(int i=0;i<sorteio.length;i++){
		sorteio[i] = leitor.nextInt();
	
	}
	
	int soma = 0;

	for(int i=0; i<aposta.length;i++){
		for(int j=0;j<sorteio.length;j++){
			if(aposta[i]==sorteio[j]){
				soma++;
			}
		
		}
	
	}
	
	if(soma==6){
		System.out.println("sena");
	}else if(soma==5){
		System.out.println("quina");
	}else if(soma==4){
		System.out.println("quadra");
	}else if(soma==3){
		System.out.println("terno");
	}else{
		System.out.println("azar");
	}

   }

}
