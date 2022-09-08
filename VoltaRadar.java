import java.util.Scanner;

public class VoltaRadar{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        int t, n, i,p;
        
        while(true){   
             
            t = leitor.nextInt();
             
            if(t==0){
                 break;
             }
        
            for(i=0;i<t;i++){
                n = leitor.nextInt();
                if(n%2!=0){
                    p = (n*2)-1;
                    System.out.println(p);
                }else{
                    p = (n*2)-2;
                    System.out.println(p);
                }
                
            }
        
        }  
    }
}