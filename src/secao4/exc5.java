package secao4;

import java.util.Locale;
import java.util.Scanner;

public class exc5 {
    public static void main(String[] args) {
        // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n1,p1,n2,p2;
        double pc1,pc2, calc;

        n1 = sc.nextInt();
        p1 = sc.nextInt();
        pc1 = sc.nextDouble();

        n2 = sc.nextInt();
        p2 = sc.nextInt();
        pc2 = sc.nextDouble();

        calc = ( (p1 * pc1) + (p2 * pc2) );

        System.out.printf("VALOR A PAGAR: %.2f", calc);


    }
}
