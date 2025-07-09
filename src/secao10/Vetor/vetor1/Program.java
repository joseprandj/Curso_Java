package secao10.Vetor.vetor1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Quantos numero voce vai digitar? ");
        n = sc.nextInt();

        if ((n > 0 && n <= 10)){
            int[] data = new int[n];
            for (int i = 0 ; i < data.length ; i++){
                System.out.print("Digite um numero: ");
                data[i] = sc.nextInt();
            }
            System.out.println("NUMERO NEGATIVOS:");
            for (int i = 0 ; i < data.length ; i++){
                if (data[i] < 0) {
                    System.out.println(data[i]);
                }
            }

        } else {
            System.out.println("Informe um número positivo entre 0 e 10");
        }

    }

}
