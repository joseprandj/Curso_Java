package secao8.excFix1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double var, qd;

        System.out.print("What is the dollar price?");
        var = sc.nextDouble();
        System.out.print("How many dollars will be bought?");
        qd = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f\n", CalcDolar.DolarToReal(var,qd));
    }
}
