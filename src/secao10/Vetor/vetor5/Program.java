package secao10.Vetor.vetor5;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0;
        double max = 0.0;
        int position = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        double[] list = new double[n];

        for (int i = 0 ; i < n ; i++){
            System.out.print("Digite um numero: ");
            list[i] = sc.nextDouble();
        }

        for (int i = 0 ; i < list.length ; i++){
            if (list[i] > max) {
                max = list[i];
                position = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.1f\n", max);
        System.out.printf("POSICAO DO MAIR VALOR = %d\n", position);


        sc.close();
    }
}
