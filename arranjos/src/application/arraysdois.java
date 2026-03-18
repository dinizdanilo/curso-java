package application;

import java.util.Locale;
import java.util.Scanner;

public class arraysdois {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga quantas vezes o programa deve repetir: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[n];
        double [] preco = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Fale o nome do produto: ");
            nome[i] = sc.nextLine();

            System.out.print("Digite o preço do produto: ");
            preco[i] = sc.nextDouble();
            sc.nextLine();

            System.out.printf("%s: R$%.2f%n", nome[i], preco[i]);
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += preco[i];
        }
        double media = soma / n;

        System.out.println("\nMédia de preços: " + media);

        sc.close();
    }
}