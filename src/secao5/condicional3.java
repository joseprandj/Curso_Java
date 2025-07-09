package secao5;

import java.util.Scanner;

public class condicional3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        String message;

        a = sc.nextInt();
        b = sc.nextInt();

        if( (a % b) == 0 || (b % a) == 0){
            message = "Multiplos";
        }
        else {
            message = "Não são Multiplos";
        }


        System.out.println(message);

        sc.close();
    }
}
