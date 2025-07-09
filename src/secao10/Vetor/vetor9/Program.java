package secao10.Vetor.vetor9;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int max = 0;
        int position = 0;

        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();

        String[] personName = new String[n];
        int[] personAge = new int[n];

        for (int i = 0 ; i < n ; i++){
            System.out.printf("Dados da %da pessoa:\n", i+1);

            System.out.print("Nome: ");
            personName[i] = sc.next();

            System.out.print("Idade: ");
            personAge[i] = sc.nextInt();
        }
        for (int i = 0 ; i < personAge.length ; i++){
            if (personAge[i] > max) {
                max = personAge[i];
                position = i;
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s", personName[position]);


        sc.close();
    }
}
