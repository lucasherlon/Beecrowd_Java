import java.util.Scanner;

public class MalaSuerte{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int i;
        int cont=0;
        String numero = new String();
        numero = leitor.next();
        
        char[] vetnum = numero.toCharArray();

        for(i=0;i<vetnum.length-1;i++){
            if(vetnum[i]=='1' && vetnum[i+1]=='3'){
               cont++;
               break;
            }
        }
        
       if(cont>0){
          System.out.println(numero+" es de Mala Suerte");
       }else{
           System.out.println(numero+" NO es de Mala Suerte");
       }
    }
}