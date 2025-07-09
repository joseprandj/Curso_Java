package secao4;

import java.util.Locale;
import java.util.Scanner;

public class exc4 {
    public static void main(String[] args) {
        // Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a,b;
        double c, calc;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextDouble();
        calc = (b*c);

        System.out.printf("NUMBER = %d", a);
        System.out.printf("\nSALARY = U$ %.2f", calc);


    }
}
