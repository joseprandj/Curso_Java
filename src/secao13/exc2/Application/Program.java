package secao13.exc2.Application;

import secao13.exc2.Entities.People;
import secao13.exc2.Entities.PeopleF;
import secao13.exc2.Entities.PeopleJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<People> taxade = new ArrayList<>();
        double totalTax = 0.0;

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++){
            System.out.printf("Tax payer #%d data:\n", (i+1));
            System.out.print("Individual or company (i/c): ");
            char tipe = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();
            if (tipe == 'i'){
                System.out.print("Heal expenditures: ");
                double spentHealth = sc.nextDouble();
                taxade.add(new PeopleF(name, income, spentHealth));
            } else {
                System.out.print("Number of peoples: ");
                int number = sc.nextInt();
                taxade.add(new PeopleJ(name, income, number));
            }
        }

        System.out.println("\nTAXES PAID: ");
        for (People tax : taxade){
            System.out.printf("%s: $ %.2f\n", tax.getName(), tax.CalcImp());
            totalTax += tax.CalcImp();
        }
        System.out.printf("\n\nTOTAL TAXES: $ %.2f", totalTax);

        sc.close();
    }
}
