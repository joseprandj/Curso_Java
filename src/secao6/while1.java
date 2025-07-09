package secao6;

import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while (a != 2002){
            System.out.println("Senha Invalida");
            a = sc.nextInt();
        }
            System.out.println("Acesso Permitido");
    }
}
