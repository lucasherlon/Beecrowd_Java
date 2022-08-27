import java.util.Scanner;

public class KageBunshin{

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int n, intnum;
        double num;
        
        while (leitor.hasNextInt()){
            n = leitor.nextInt();
            num = Math.log(n)/Math.log(2);
            
            intnum = (int)num;
            
            System.out.println(intnum);
        }
    }

}