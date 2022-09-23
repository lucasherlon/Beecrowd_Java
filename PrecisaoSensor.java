import java.util.Scanner;

public class PrecisaoSensor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double sensor, media, soma;
		int h,m, qt;
		
		while(leitor.hasNextInt()) {
			h = leitor.nextInt();
			m = leitor.nextInt();
			
			qt = (h*60)/m;
			
			double[] vet = new double[qt];
			soma=0;
			
			for(int i=0;i<vet.length;i++) {
				vet[i]=leitor.nextDouble();
				soma = soma + vet[i];
			}
			
			media = soma/qt;
			
			double somaM=0;
			
			for(int i=0;i<vet.length;i++) {
				somaM = somaM + Math.pow(vet[i]-media,2);
			}
			
			sensor = Math.sqrt(somaM/(qt-1));
			
			System.out.printf("%.5f\n", sensor);
			
		}
	}

}
