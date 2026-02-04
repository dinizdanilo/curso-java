import java.util.Locale;
import java.util.Scanner;

public class ExercicioValorRaio {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio do círculo: ");
        double x = sc.nextDouble();

        double pi = 3.14159;
        double area = pi * (x * x);
        System.out.printf("A área do círculo é igual a %.4f", area);
    }
}