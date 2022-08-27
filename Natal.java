import java.util.Scanner;

public class Natal{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int bol, gal, num;
        
        bol = leitor.nextInt();
        gal = leitor.nextInt();
        
        if(gal%2==1){
            gal -= 1;
        }
        
        if(bol*2>=gal){
            System.out.println("Amelia tem todas bolinhas!");
        }else{
            num = (gal-bol*2)/2;
            System.out.println("Faltam "+num+" bolinha(s)");
        }
    }
}