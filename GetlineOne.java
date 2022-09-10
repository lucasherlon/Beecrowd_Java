import java.util.Scanner;

public class GetlineOne {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String nome = new String();
        String buffer = new String();
        double media;
        int soma, cont, dist;
        cont = 0;
        soma = 0;

        while (leitor.hasNextLine()) {
            nome = leitor.nextLine();
            dist = leitor.nextInt();
            buffer = leitor.nextLine();

            soma += dist;
            cont++;

        }

        media = (double) soma / cont;

        System.out.printf("%.1f\n", media);

    }
}