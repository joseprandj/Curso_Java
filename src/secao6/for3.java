package secao6;

import java.util.Locale;
import java.util.Scanner;

public class for3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        for (int i=0 ; i<n ; i++){
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
