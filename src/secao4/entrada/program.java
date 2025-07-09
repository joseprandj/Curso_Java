package secao4.entrada;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Entrada de Texto
        String a;
        a = sc.next();
        System.out.println("Digitou: " + a);
        */

        /* Entrada de Inteiro
        int a;
        a = sc.nextInt();
        System.out.println("Digitou: " + a);
        */

        /* Entrada de Decimais
        double a;
        a = sc.nextDouble();
        System.out.println("Digitou: " + a);
        */

        char a;
        a = sc.next().charAt(0);
        System.out.println("Digitou: " + a);



        sc.close();
    }
}
