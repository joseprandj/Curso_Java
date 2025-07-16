package secao18.application;

import secao18.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String itemCSV = br.readLine();
            while (itemCSV != null){
                String[] fields = itemCSV.split(",");
                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                itemCSV = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            List<String> email = employees.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(e -> e.getEmail())
                    .sorted()
                    .collect(Collectors.toList());
            System.out.printf("Email of people whose salary is more than %.2f: \n", salary);
            email.forEach(System.out::println);

            double sum = employees.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x,y) -> x+y);

            System.out.printf("Sum of salary of people whose name starts with 'M': %.2f", sum);

        } catch (IOException e) {
            System.out.printf("Error: %s", e.getMessage());
        }finally {
            sc.close();
        }
    }
}
