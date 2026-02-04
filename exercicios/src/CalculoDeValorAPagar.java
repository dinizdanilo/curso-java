import java.util.Locale;
import java.util.Scanner;

public class CalculoDeValorAPagar {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código da primeira peça (1): ");
        int pecaUm = sc.nextInt();

        System.out.printf("%nDigite a quantidade de peças: ");
        int qtdPecaUm = sc.nextInt();

        System.out.printf("%nDigite o valor unitário por peça: ");
        double valorUniPecaUm = sc.nextDouble();

        double valorTotalPecaUm = (valorUniPecaUm * qtdPecaUm);
        System.out.printf("%nO valor total da peça 1 foi R$%.2f%n", valorTotalPecaUm);


        System.out.printf("%nDigite o código da segunda peça (2): ");
        int pecaDois = sc.nextInt();

        System.out.printf("%nDigite a quantidade de peças: ");
        int qtdPecaDois = sc.nextInt();

        System.out.printf("%nDigite o valor unitário por peça: ");
        double valorUniPecaDois = sc.nextDouble();

        sc.close();

        double valorTotalPecaDois = (valorUniPecaDois * qtdPecaDois);
        System.out.printf("%nO valor total da peça 2 foi R$%.2f%n", valorTotalPecaDois);


        double valorFinal = (valorTotalPecaUm + valorTotalPecaDois);
        System.out.printf("%nO valor total a ser pago é R$%.2f", valorFinal);
    }
}