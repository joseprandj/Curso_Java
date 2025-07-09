package secao5;

import java.util.Locale;
import java.util.Scanner;

public class condicional6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a;
        String message;

        a = sc.nextDouble();

        if( a >= 0 && a <= 25.00){
            message = "Intervalo [0,25]";
        } else if (a >= 25.00 && a <= 50.00) {
            message = "Intervalo [25,50]";
        } else if (a >= 50.00 && a <= 75.00){
            message = "Intervalo [50,75]";
        } else if (a >= 75.00 && a <= 100.00){
            message = "Intervalo [75,100]";
        } else {
            message = "Fora de intervalo";
        }

        System.out.printf(message);

        sc.close();
    }
}
