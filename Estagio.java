import java.util.Scanner;

public class Estagio{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        int m, nota, ch;
        int somaN, somaD;
        double ira;
        
        while(leitor.hasNextInt()){
            m = leitor.nextInt();
            
            somaN=0;
            somaD=0;
            
            for(int i=0;i<m;i++){
                nota = leitor.nextInt();
                ch = leitor.nextInt();
                
                somaN += nota*ch;
                somaD += ch;
            }
            
            ira = (double)somaN/(100*somaD);
            
            System.out.printf("%.4f\n", ira);
            
            
        }
    }
}