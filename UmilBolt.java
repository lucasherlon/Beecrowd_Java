import java.util.Scanner;

public class UmilBolt{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        int tent;
        double vel, menor=0;
        
        while(leitor.hasNextInt()){
            tent = leitor.nextInt();
            
            for(int i=0;i<tent;i++){
                vel = leitor.nextDouble();
                if(i==0){
                    menor=vel;
                }else{
                    if(vel<menor){
                        menor = vel;
                    }
                }
            }
            
            System.out.printf("%.2f\n", menor);
        }
    }
}