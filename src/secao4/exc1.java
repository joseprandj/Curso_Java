package secao4;

import java.util.Scanner;

public class exc1 {
    public static void main(String[] args) {
        // Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
        Scanner sc = new Scanner(System.in);
        int a,b, calc;

        a = sc.nextInt();
        b = sc.nextInt();
        calc = a + b;

        System.out.println("Soma = " + calc);


    }
}
