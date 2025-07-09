package secao10.Vetor.vetor12;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        Guest[] guest = new Guest[10];

        System.out.print("How many rooms will be rented? ");
        n = sc.nextInt();

        for (int i = 0 ; i < n ; i++){
            System.out.printf("\nRent #%d:\n", i+1);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room: ");
            int room = sc.nextInt();

            guest[room] = new Guest(name, email);
        }
        System.out.println("Busy rooms:");
        for (int i = 0 ; i < guest.length ; i++){
            if (guest[i] != null){
                System.out.printf("%d: ", i);
                System.out.println(guest[i]);
            }
        }



        sc.close();
    }

}
