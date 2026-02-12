import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de casos do teste: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("\nDigite os 3 números do caso abaixo: ");
            double A = sc.nextDouble() * 2;
            double B = sc.nextDouble() * 3;
            double C = sc.nextDouble() * 5;

            double media = (A + B + C) / 10;

            System.out.printf("A média ponderada foi = %.1f%n", media);
        }
    }
}