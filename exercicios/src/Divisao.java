import java.util.Locale;
import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas vezes você quer repetir o programa: " );
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("\nDigite 2 números para dividir abaixo: ");
            double numerador = sc.nextDouble();
            double denominador = sc.nextDouble();

            double divisao = numerador / denominador;
            if (denominador == 0) {
                System.out.println("Divisão impossível");
            }
            else {
                System.out.println(divisao);
            }
        }
    }
}