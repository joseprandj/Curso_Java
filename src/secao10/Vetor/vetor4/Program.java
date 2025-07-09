package secao10.Vetor.vetor4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int totSum = 0;
        int count = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        int[] list = new int[n];

        for (int i = 0 ; i < list.length ; i++){
            System.out.print("Digite um numero: ");
            list[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES:");
        for (int i = 0 ; i < list.length ; i++){
            if ( (list[i] % 2 ) == 0){
                System.out.printf(" %d", list[i]);
                count += 1;
            }
        }
        System.out.printf("\n\nQUANTIDADE DE PARES = %d", count);

    }
}
