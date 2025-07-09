package secao5;

import java.util.Locale;
import java.util.Scanner;

public class condicional5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, calc;

        a = sc.nextDouble();
        b = sc.nextDouble();

        if( a == 1){
            calc = b*4;
        } else if (a == 2){
            calc = b*4.5;
        } else if (a == 3){
            calc = b*5;
        } else if (a == 4){
            calc = b*2;
        } else {
            calc = b*1.5;
        }

        System.out.printf("Total: R$ %.2f", calc);

        sc.close();
    }
}
