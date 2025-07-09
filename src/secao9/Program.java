package secao9;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int conta = sc.nextInt();

        System.out.print("Enter account holder: ");
        String name = sc.next();

        Account account = new Account(name, conta);

        System.out.print("Is there na initial deposit (y/n): ");
        char yesNo = sc.next().charAt(0);

        if (yesNo == 'y' || yesNo == 'Y'){
            System.out.print("Enter initial deposit value: ");
            double saldo = sc.nextDouble();
            account.AddBalance(saldo);

            System.out.println("\nAccount data: ");
            System.out.printf(
                    "Account " + account.getNumberAccount()
                            + ", Holder: " + account.getNameAccount()
                            + ", Balance: $" + String.format("%.2f", account.getBalanceAccount())
            );
        } else {
            System.out.println("\nAccount data: ");
            System.out.printf(
                    "Account " + account.getNumberAccount()
                    + ", Holder: " + account.getNameAccount()
                    + ", Balance: $" + String.format("%.2f", account.getBalanceAccount())
            );
        };

        System.out.print("\n\nEnter deposit value: ");
        double saldo = sc.nextDouble();
        account.AddBalance(saldo);
        System.out.printf(
                "Update account data: \n" +
                        "Account " + account.getNumberAccount()
                        + ", Holder: " + account.getNameAccount()
                        + ", Balance: $" + String.format("%.2f", account.getBalanceAccount())
        );

        System.out.print("\n\nEnter a withdraw value: ");
        saldo = sc.nextDouble();
        account.RemoveBalance(saldo);
        System.out.printf(
                "Update account data: \n" +
                        "Account " + account.getNumberAccount()
                        + ", Holder: " + account.getNameAccount()
                        + ", Balance: $" + String.format("%.2f", account.getBalanceAccount())
        );

    }
}
