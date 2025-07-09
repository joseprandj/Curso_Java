package secao5;

import java.util.Locale;
import java.util.Scanner;

public class condicional8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a,b;

        a = sc.nextDouble();

        if(a <= 2000){
            System.out.println("Isento");
        } else if (a >= 2000.01 && a <= 3000){
            b = (a - 2000) * 0.08;
            System.out.printf("R$ %.2f",b);
        } else if (a >= 3000.01 && a <= 4500){
            b = (a - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f",b);
        } else {
            b = (a - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f",b);
        }


        sc.close();
    }
}
