package secao5;

import java.util.Scanner;

public class condicional1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        String message;

        a = sc.nextInt();

        if(a >= 0){
            message = "POSITIVO";
        }
        else {
            message = "NEGATIVO";
        }


        System.out.println(message);

        sc.close();
    }
}
