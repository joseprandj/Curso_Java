package secao8.exc1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle width and height");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.printf("AREA = %.2f\n", retangulo.Area());
        System.out.printf("PERIMETER = %.2f\n", retangulo.Perimeter());
        System.out.printf("DIAGONAL = %.2f\n", retangulo.Diagonal());

    }
}
