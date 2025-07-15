package secao17.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> totCourse = new HashSet<>();

        try {
            System.out.print("How many studens for course A: ");
            int nA = sc.nextInt();
            for (int i = 0 ; i < nA ; i++){
                int course = sc.nextInt();
                totCourse.add(course);
            }

            System.out.print("How many studens for course B: ");
            int nB = sc.nextInt();
            for (int i = 0 ; i < nB ; i++){
                int course = sc.nextInt();
                totCourse.add(course);
            }

            System.out.print("How many studens for course C: ");
            int nC = sc.nextInt();
            for (int i = 0 ; i < nC ; i++){
                int course = sc.nextInt();
                totCourse.add(course);
            }

            System.out.printf("Total students: %d", totCourse.size());
        } finally {
            sc.close();
        }

    }
}
