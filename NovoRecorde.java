import java.util.Scanner;

public class NovoRecorde{
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int[] vet = new int[30];
		
		int n, dur, dis,j;
		double vel, maior;
		
		while(leitor.hasNextInt()){
		    
		    n = leitor.nextInt();
		    maior=0;
		    j=0;
		    
		    for(int i=1; i<=n;i++){
		        
		        dur = leitor.nextInt();
		        dis = leitor.nextInt();
		        
		        vel = (double)dis/dur;
		        
		        if(vel>maior){
		            maior = vel;
		            vet[j]=i;
		            j++;
		            
		        }
		    }
		    
		    for(int i=0; i<j;i++){
		        System.out.println(vet[i]);
		    }
		}
		
	}
}