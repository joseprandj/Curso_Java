package secao4.saida;
import java.util.Locale;

public class program {
    public static void main(String[] args) {
        int a = 32;
        double b = 10.256474;
        String c = "JJ";

        // Saída normal
        System.out.println(a);

        // Saída formatada
        System.out.printf("%.4f\n",b);

        // Local com saída formatada
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f\n",b);

        // Concatenação de dados
        System.out.println("Resultado: " + a + " total");

        // Saída formatada, passando variavel no final
        System.out.printf("Variavel b = %f", b);

        // Saída formatada com tipos de dados diferente
        // %f = Decimal | %d = Inteiro | %s = Texto
        System.out.printf("Variavel a = %d - Variavel b = %f - Variavel C = %s", a, b, c);
    }
}