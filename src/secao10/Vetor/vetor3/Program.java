package secao10.Vetor.vetor3;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double child = 0;
        String childName = "";

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Person[] person = new Person[n];

        for (int i = 0 ; i < n ; i++){
            System.out.printf("Dados da %da pessoa:\n", i+1);

            System.out.print("Nome: ");
            String name = sc.next();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            System.out.print("Altura: ");
            double height = sc.nextDouble();

            person[i] = new Person(name, age, height);
        }

        for (int i = 0 ; i < person.length ; i++){
            sum += person[i].getHeight();
        }
        System.out.printf("\nAltura média: %.2f", (sum / person.length) );

        for (int i = 0 ; i < person.length ; i++){
            if (person[i].getAge() < 16) {
                child += 1;
                childName += person[i].getName() + "\n";
            }
        }
        System.out.println(
                "\nPessoas com menos de 16 anos: "
                + ( (child / person.length) * 100 )
                + "%\n"
                + childName
        );
    }
}
