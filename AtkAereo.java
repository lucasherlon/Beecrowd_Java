import java.util.Scanner;

public class AtkAereo{
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        
        int n = leitor.nextInt();
        
        for(int i =0; i<n; i++){
            
            String jog1 = leitor.next();
            String jog2 = leitor.next();
            
            if(jog1.equals("ataque") && jog2.equals("pedra")){
                System.out.println("Jogador 1 venceu");
            }else if(jog1.equals("pedra") && jog2.equals("papel")){
                System.out.println("Jogador 1 venceu");
            }else if(jog1.equals("ataque") && jog2.equals("papel")){
                System.out.println("Jogador 1 venceu");
            }else if(jog1.equals("papel") && jog2.equals("papel")){
                System.out.println("Ambos venceram");
            }else if(jog1.equals("pedra") && jog2.equals("pedra")){
                System.out.println("Sem ganhador");
            }else if(jog1.equals("ataque") && jog2.equals("ataque")){
                System.out.println("Aniquilacao mutua");
            }else{
                System.out.println("Jogador 2 venceu");
            }
            
        }
    }
}
