import java.util.Scanner;

public class RodizioVeicular {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        
        
        for(int i=0;i<n;i++){
        	String placa = leitor.next();
            char[] trans = placa.toCharArray();
            
            if(placa.length()!= 8) {
            	System.out.println("FAILURE");
            }else if((trans[0]<65 || trans[0]>90)|| (trans[1]<65 || trans[1]>90) ||
            		(trans[2]<65 || trans[2]>90)) {
            	System.out.println("FAILURE");
            }else if(trans[3]!='-') {
            	System.out.println("FAILURE");
            }else if((trans[4]<48 && trans[4]>57)|| (trans[5]<48 && trans[5]>57) ||
            		(trans[6]<48 && trans[6]>57) || (trans[7]<48 && trans[7]>57)) {
            	System.out.println("FAILURE");
            }else {
            	if(trans[7]=='1'|| trans[7]=='2') {
            		System.out.println("MONDAY");
            	}else if(trans[7]=='3'|| trans[7]=='4') {
            		System.out.println("TUESDAY");
            	}else if(trans[7]=='5'|| trans[7]=='6') {
            		System.out.println("WEDNESDAY");
            }else if(trans[7]=='7'|| trans[7]=='8') {
        		System.out.println("THURSDAY");
            }else if(trans[7]=='9'|| trans[7]=='0') {
        		System.out.println("FRIDAY");
            }
	 }
      }
   }
}
