package secao10.Vetor.vetor7;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0;
        double sum = 0.0;
        double media = 0.0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        double[] decimal = new double[n];

        for (int i = 0 ; i < n ; i++){
            System.out.print("Digite um numero: ");
            decimal[i] = sc.nextDouble();
        }

        for (int i = 0 ; i < decimal.length ; i++){
            sum += decimal[i];
        }
        media = (sum/ decimal.length);

        System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0 ; i < decimal.length ; i++){
            if ( (decimal[i] < media) ) {
                System.out.println(decimal[i]);
            }
        }


        sc.close();

    }
}
