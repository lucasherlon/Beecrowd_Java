import java.util.Scanner;

public class Dardos{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        int n,i,j,k,x,d;
        int somaM, somaJ;
        
        n = leitor.nextInt();
        
        for(i=0;i<n;i++){
            somaJ=0;
            for(j=0;j<3;j++){
                x = leitor.nextInt();
                d = leitor.nextInt();
                somaJ = somaJ + (x*d);
            }
            somaM=0;
            for(k=0;k<3;k++){
                x = leitor.nextInt();
                d = leitor.nextInt();
                somaM = somaM + (x*d);
            }
            
            if(somaJ>somaM){
                System.out.println("JOAO");
            }else{
                System.out.println("MARIA");
            }
        }
        
    }
}