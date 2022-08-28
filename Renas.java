import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        int bolas=0, soma=0;
        
        Scanner leitor = new Scanner(System.in);
        
        
        for(int i=0; i<9; i++ ){
            
            bolas = leitor.nextInt();
            
            soma += bolas;
        }
        
        if(soma%9==0){
            System.out.println("Rudolph");
        }else if(soma%9==1){
            System.out.println("Dasher");
        }else if(soma%9==2){
            System.out.println("Dancer");
        }else if(soma%9==3){
            System.out.println("Prancer");
        }else if(soma%9==4){
            System.out.println("Vixen");
        }else if(soma%9==5){
            System.out.println("Comet");
        }else if(soma%9==6){
            System.out.println("Cupid");
        }else if(soma%9==7){
            System.out.println("Donner");
        }else if(soma%9==8){
            System.out.println("Blitzen");
        }
    }
}