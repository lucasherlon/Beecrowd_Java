import java.util.Scanner;

public class FigurinhasCopa{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        int total, carim, comp, cont,i,j, adq;
        
        total = leitor.nextInt();
        carim = leitor.nextInt();
        comp = leitor.nextInt();
        
        int vcarim[] = new int[carim];
        int vcomp[] = new int[comp];
        
        for(i=0;i<carim;i++){
            vcarim[i] = leitor.nextInt();
        }
        
        for(i=0;i<comp;i++){
            vcomp[i] = leitor.nextInt();
        }
        
        cont=0;
        for(i=0;i<carim;i++){
            for(j=0;j<comp;j++){
                if(vcarim[i]==vcomp[j]){
                    cont++;
                    break;
                }
            }
        }

        adq = carim-cont;
        System.out.println(adq);
        
    }
}