package exercicios;

import java.util.Scanner;
import java.util.Arrays;

public class BooksCatalog {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int p = leitor.nextInt();
		int[] pV = new int[p];
		
		for(int i=0;i<pV.length;i++) {
			pV[i] = leitor.nextInt();
		}
		
		int m = leitor.nextInt();
		int[] mV = new int[m];
		for(int i=0;i<mV.length;i++) {
			mV[i] = leitor.nextInt();
		}
		
		int f = leitor.nextInt();
		int[] fV = new int[f];
		for(int i=0;i<fV.length;i++) {
			fV[i] = leitor.nextInt();
		}
		
		int q = leitor.nextInt();
		int[] qV = new int[q];
		for(int i=0;i<qV.length;i++) {
			qV[i] = leitor.nextInt();
		}
		
		int b = leitor.nextInt();
		int[] bV = new int[b];
		for(int i=0;i<bV.length;i++) {
			bV[i] = leitor.nextInt();
		}
		
		int k = leitor.nextInt();
		int tam = p*m*f*q*b;
		
		int[] vet = new int[tam];
		int w=0;
		
		for(int i=0;i<pV.length;i++) {
			for(int j=0;j<mV.length;j++) {
				for(int x=0;x<fV.length;x++) {
					for(int l=0;l<qV.length;l++) {
						for(int n=0;n<bV.length;n++) {
							
							vet[w] = pV[i] + mV[j] + fV[x] + qV[l] + bV[n];
							w++;
							
						}
					}
				}
			}
		}
		
		Arrays.sort(vet);
		
		int soma=0;
		
		for(int i=vet.length-1;i>=vet.length-1-(k-1);i--) {
			soma += vet[i];
		}
	
		System.out.println(soma);
		
		
	}

}
