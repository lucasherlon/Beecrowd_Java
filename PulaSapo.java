import java.util.Scanner;

public class PulaSapo{
    public static void main(String[] args){
        
        int p, n, c, ant=0, cont=0;
        
        Scanner leitor = new Scanner(System.in);
        
        p = leitor.nextInt();
        n = leitor.nextInt();
        
        for(int i = 0; i<n;i++){
            c = leitor.nextInt();
            if(i==0){
                ant=c;
            }else{
                if(c-ant>p){
                    cont++;
                    break;
                }else if(c-ant<-p){
                    cont++;
                    break;
                }
                ant=c;
            }
        }
        if(cont>0){
            System.out.println("GAME OVER");
        }else{
            System.out.println("YOU WIN");
        }
    }
}