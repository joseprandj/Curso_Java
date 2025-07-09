package secao10.Vetor.vetor8;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        double media = 0.0;
        int countPar = 0;
        int countImp = 0;


        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] inteiro = new int[n];
        for (int i = 0 ; i < inteiro.length ; i++){
            System.out.print("Digite um numero: ");
            inteiro[i] = sc.nextInt();
        }

        for (int i = 0 ; i < inteiro.length ; i++){
            if (inteiro[i] % 2 != 0) {
                countImp += 1;
            } else {
                sum += inteiro[i];
                countPar += 1;
            }
        }

        if (countPar > 0) {
            media = (sum / countPar);
            System.out.printf("MEDIA DOS PARES = %.1f", media);
        } else {
            System.out.print("NENHUM NUMERO PAR");
        }



        sc.close();
    }
}
