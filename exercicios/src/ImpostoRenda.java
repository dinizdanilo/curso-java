import java.util.Locale;
import java.util.Scanner;

public class ImpostoRenda {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário para calcularmos seu imposto de renda: ");
        double salario = sc.nextDouble();
        double imposto;


        if (salario > 4500) {
            imposto = (salario - 4500) * 0.28 + (1500  * 0.18) + (1000 * 0.08);
        } else if (salario > 3000) {
            imposto = (salario - 3000) * 0.18 + (1000 * 0.08);
        } else if (salario > 2000) {
            imposto = (salario - 2000) * 0.08;
        }
        else {
            imposto = 0;
        }

        System.out.printf("\nO valor que você pagará de imposto de renda será %.2f", imposto);
    }
}