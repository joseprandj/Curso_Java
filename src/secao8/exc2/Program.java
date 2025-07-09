package secao8.exc2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        double percent;

        System.out.print(employee);
        System.out.print("Which percentage to increase salary?");
        percent = sc.nextDouble();
        System.out.printf("\nUpdated data: %s, $ %.2f", employee.name, employee.IncreaseSalary(percent));

        sc.close();
    }
}
