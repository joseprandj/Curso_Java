package secao10.Vetor.vetor11;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0;
        double maxHeight = 0.0;
        double minHeight = Double.MAX_VALUE;
        double sum = 0.0;
        int mans = 0;
        int wowmans = 0;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        SexHeight[] sexHeight = new SexHeight[n];

        for (int i = 0 ; i < sexHeight.length ; i++){
            System.out.printf("Altura da %da pessoa:", i+1);
            double height = sc.nextDouble();
            System.out.printf("Genero da %da pessoa:", i+1);
            char sex = sc.next().charAt(0);

            sexHeight[i] = new SexHeight(sex, height);
        }
        for (int i = 0 ; i < sexHeight.length ; i++){
            if (sexHeight[i].getHeight() > maxHeight) {
                maxHeight = sexHeight[i].getHeight();
            }
            if (sexHeight[i].getHeight() < minHeight){
                minHeight = sexHeight[i].getHeight();
            }
        }
        for (int i = 0 ; i < sexHeight.length ; i++){
            if (sexHeight[i].getSex() == 'f' || sexHeight[i].getSex() == 'F') {
                wowmans += 1;
                sum += sexHeight[i].getHeight();
            } else {
                mans += 1;
            }
        }
        System.out.printf("Menor altura = %.2f\n", minHeight);
        System.out.printf("Maior altura = %.2f\n", maxHeight);
        System.out.printf("Media das alturas das mulheres = %.2f\n", (sum/wowmans));
        System.out.printf("Numero de homens = %d\n", mans);

        sc.close();
    }
}
