package secao5;

import java.util.Scanner;

public class condicional2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        String message;

        a = sc.nextInt();

        if( (a % 2) == 0){
            message = "PAR";
        }
        else {
            message = "IMPAR";
        }


        System.out.println(message);

        sc.close();
    }
}
