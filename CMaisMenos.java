import java.util.Scanner;

public class CMaisMenos{
	public static void main(String[] args) {
	
    	Scanner leitor = new Scanner(System.in);
    	int vit = 0;
    	int unidade=0;
    	String tipo = new String();
    	
    	while(true){
    	    
    	    int t = leitor.nextInt();
    	    
    	    if(t==0){
    	        break;
    	    }
    	    
    	    int rec =0;
    	 
    	    int soma=0;
    	    
    	    for(int i=0;i<t;i++){
    	        
    	        unidade = leitor.nextInt();
    	        tipo = leitor.nextLine();
    	        
    	    
        	    if(tipo.equals(" suco de laranja")){
        	       vit=120;
        	   }else if(tipo.equals(" morango fresco")){
        	       vit=85;
        	   }else if(tipo.equals(" mamao")){
        	       vit=85;
        	   }else if(tipo.equals(" goiaba vermelha")){
        	       vit=70;
        	   }else if(tipo.equals(" manga")){
        	       vit=56;
        	   }else if(tipo.equals(" laranja")){
        	       vit=50;
        	   }else if(tipo.equals(" brocolis")){
        	       vit=34;
        	   }
        	       

    	        soma += unidade*vit;

    	    }
    	   
    	   if (soma>130){
    	       rec = soma-130;
    	       System.out.println("Menos "+rec+" mg");
    	   }else if(soma<110){
    	       rec = 110 - soma;
    	       System.out.println("Mais "+rec+" mg");
    	   }else{
    	       System.out.println(soma+" mg");
    	   }
    	}
	}
}