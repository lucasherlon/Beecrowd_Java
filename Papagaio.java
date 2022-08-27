import java.util.Scanner;

public class Papagaio{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        String pernas = new String();
        
        while(leitor.hasNextLine()){
        
            pernas = leitor.nextLine();
            
            if(pernas.equals("esquerda")){
                System.out.println("ingles");
            }else if(pernas.equals("direita")){
                System.out.println("frances");
            }else if(pernas.equals("nenhuma")){
                System.out.println("portugues");
            }else if(pernas.equals("as duas")){
                System.out.println("caiu");
            }
            
            
        }
    }
}