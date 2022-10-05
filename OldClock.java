package exercicios;

import java.util.Scanner;

public class OldClock {
	
	public static void main(String[] args){
	
		Scanner leitor = new Scanner(System.in);
		
		int h,m, horas,min;
		
		while(leitor.hasNextInt()){
		
			h = leitor.nextInt();
			m = leitor.nextInt();
			
			horas = (int) (((double)h/360)*12);
			min = (int) (((double)m/360)*60);
			
			if(horas<10 && min<10){
				System.out.println("0"+horas+":0"+min);
			}else if(horas<10 && min>=10){
				System.out.println("0"+horas+":"+min);
			}else if(horas>=10 && min>=10){
				System.out.println(horas+":"+min);
			}else if(horas>=10 && min<10){
				System.out.println(horas+":0"+min);
			}
		}
	}
}
