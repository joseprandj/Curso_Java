package secao14.application;

import secao14.model.entities.Account;
import secao14.model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");

        System.out.print("Number: ");
        Integer number = sc.nextInt();

        System.out.print("Holder: ");
        String holder = sc.next();

        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        Double withLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withLimit);

        System.out.print("\nEnter amount for withdraw: ");
        Double withDraw = sc.nextDouble();

        try {
            account.withdraw(withDraw);
            System.out.printf("New balance: %.2f\n", account.getBalance());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
