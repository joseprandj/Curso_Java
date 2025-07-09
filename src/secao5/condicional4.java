package secao5;

import java.util.Scanner;

public class condicional4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b, calc;

        a = sc.nextInt();
        b = sc.nextInt();

        if( a < b){
            calc = b-a;
        }
        else {
            calc = (24 - a) + b;
        }


        System.out.printf("O JOGO DUROU %d HORA(S)", calc);

        sc.close();
    }
}
