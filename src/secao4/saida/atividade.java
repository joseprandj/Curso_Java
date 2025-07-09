package secao4.saida;

import java.util.Locale;

public class atividade {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";
        char gender = 'F';

        int age = 30;
        int code = 5290;

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf(
                "Products:\n" +
                "%s, wich price is $ %f\n" +
                "%s, wich price is $ %f \n\n" +
                "Record: %d years old, code %d and gender: %s \n\n"+
                "Measure with eight decimal places: %f \n" +
                "Rouded (three decimal places): %.3f",
                product1, price1,
                product2, price2,
                age, code, gender,
                measure, measure
        );
        Locale.setDefault(Locale.US);
        System.out.printf("\nUS decimal point: %.2f\n",measure);
    }
}
