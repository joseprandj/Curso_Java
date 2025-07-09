package secao6;

import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int i = sc.nextInt();

        while (i != 4){
            switch (i){
                case 1:
                    a += 1;
                    break;
                case 2:
                    b += 1;
                    break;
                case 3:
                    c += 1;
                    break;
                default:
                    break;
            }
            i = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d \n Gasolina: %d \n Diesel: %d \n", a, b, c);

    }
}
