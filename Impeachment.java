import java.util.Scanner;

public class Impeachment{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        double min = (2.0/3.0);
        int num;
        int voto;
        
        while(leitor.hasNextInt()){
            num = leitor.nextInt();
            
            double result = 0;
            int fav = 0;
            int contr = 0;
            
            for(int i=0;i<num;i++){
                voto = leitor.nextInt();
                if(voto==1){
                    fav +=1;
                }else{
                    contr += 1;
                }
                
            }
            
            result = (double)fav/num;
            
            if(result >= min){
                System.out.println("impeachment");
               
            }else{
                System.out.println("acusacao arquivada");
             
            }
            
        }
        
    }
}