package secao8.exc3;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.name = sc.nextLine();
        aluno.n1 = sc.nextDouble();
        aluno.n2 = sc.nextDouble();
        aluno.n3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f\n", aluno.TotalN());
        System.out.println(aluno.AprovedReproved(aluno.TotalN()));
    }
}
