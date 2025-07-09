package secao10.Vetor.vetor10;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0;
        double media = 0.0;

        System.out.print("Quantos alunos serão digitados? ");
        n = sc.nextInt();
        Student[] student = new Student[n];

        for (int i = 0 ; i < student.length ; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i+1);
            String name = sc.next();
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            char aproved = 'n';
            if ( ( (n1+n2) / 2 ) >= 6.0 ) {
                aproved = 'y';
            }

            student[i] = new Student(name, n1, n2, aproved);
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0 ; i < student.length ; i++){
            if (student[i].getAproved() == 'y') {
                System.out.printf("%s, Média: %.1f\n", student[i].getName(), (student[i].getN1()+student[i].getN2())/2 );
            }
        }

        sc.close();
    }
}
