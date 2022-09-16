import java.util.Scanner;
import java.util.Arrays;

public class Laercio{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        int n,m;
        int i,j;
        
        n = leitor.nextInt();
        
        for(i=0;i<n;i++){
            m = leitor.nextInt();
            int[] vet = new int[m];
            
            for(j=0;j<m;j++){
                vet[j] = leitor.nextInt();
            }
            
            int[] impi = new int[m];
            
            int k=0;
            for(j=0;j<m;j++){
                if(vet[j]%2!=0){
                    impi[k]=vet[j];
                    k++;
                }
            }
            
            int[] imp = new int[k];
             
            for(int x=0;x<k;x++){
                imp[x]=impi[x];
            }
           
            Arrays.sort(imp);
             
             int[] impr = new int[k];
             int a=0;
             for(int l=k-1; l>=0;l--){
                 impr[a]=imp[l];
                 a++;
             }

             int contp=0;
             int conti=0;
             
             
             int[] res = new int[k];
             for(int c=0;c<k;c++){
                 if(c%2==0){
                     res[c] = impr[contp];
                     contp++;
                 }else{
                     res[c] = imp[conti];
                     conti++;
                 }
             }
             
             for(int c=0; c<k;c++){
                 if(c==k-1){
                     System.out.print(res[c]);
                 }else{
                     System.out.printf("%d ", res[c]);
                 }
             }
             
            System.out.println();  
        }
    }
}