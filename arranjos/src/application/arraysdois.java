package application;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class arraysdois {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos produtos você quer cadastrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        Produto[] vect = new Produto[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Digite o preço do produto: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            vect[i] = new Produto(nome, preco);
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i].getPreco();
        }
        double media = soma / n;

        System.out.printf("Preço médio = %.2f%n", media);

        sc.close();
    }
}