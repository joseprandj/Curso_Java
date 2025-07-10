package secao12.expResolvido;

import secao12.expResolvido.entities.Department;
import secao12.expResolvido.entities.HourContract;
import secao12.expResolvido.entities.Worker;
import secao12.expResolvido.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String nameDepartment = sc.nextLine();

        System.out.print("Enter worker data: \n");
        System.out.print("Name: ");
        String nameWorker = sc.next();
        System.out.print("Level: ");
        String level = sc.next();
        System.out.print("Base salary: ");
        double salary = sc.nextDouble();

        Worker worker  = new Worker(nameWorker, WorkerLevel.valueOf(level), salary, new Department(nameDepartment));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++){
            System.out.printf("Enter contract #%d data:", i+1);
            System.out.print("Date (DD/MM/YYYY): ");
            Date date = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double value = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hour = sc.nextInt();

            HourContract contract = new HourContract(date, value, hour);
            worker.addContract(contract);
        }

        System.out.print("Enter month and yer to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.printf("Name: %s\n", worker.getName());
        System.out.printf("Department: %s\n", worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f", monthAndYear, worker.income(year, month));

        sc.close();
    }
}
