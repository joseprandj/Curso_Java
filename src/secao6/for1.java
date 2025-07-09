package secao6;

import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i=1 ; x > i ; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
