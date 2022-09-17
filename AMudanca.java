import java.util.Scanner;

public class AMudanca {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int angulo;
		
		while(leitor.hasNextInt()) {
			angulo = leitor.nextInt();
			
			if(angulo == 0 || angulo == 360) {
				System.out.println("Bom Dia!!");
			}else if(angulo > 0 && angulo < 90) {
				System.out.println("Bom Dia!!");
			}else if(angulo >= 90 && angulo < 180) {
				System.out.println("Boa Tarde!!");
			}else if(angulo >=180 && angulo < 270) {
				System.out.println("Boa Noite!!");
			}else {
				System.out.println("De Madrugada!!");
			}
		}

	}

}
