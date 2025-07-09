package secao10.Vetor.vetor2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        System.out.print("Quantos numero voce vai digitar? ");
        int n = sc.nextInt();
        double[] list = new double[n];

        for (int i = 0 ; i < n ; i++){
            System.out.print("Digite um numero: ");
            list[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0 ; i < list.length ; i++){
            System.out.printf("%.1f ", list[i]);
            soma += list[i];
        }

        System.out.printf("\nSOMA = %.2f", soma);
        System.out.printf("\nSOMA = %.2f", (soma/ list.length));
    }
}
