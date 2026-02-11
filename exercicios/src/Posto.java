import java.util.Scanner;

public class Posto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("""
                    Selecione o tipo de combustível abaixo:\s
                    1 ----- Álcool
                    2 ----- Gasolina
                    3 ----- Diesel
                    4 ----- Sair do programa
                    """);

        System.out.print("Digite aqui: ");
        int tipo = sc.nextInt();

        int qtdAlcool = 0;
        int qtdGasolina = 0;
        int qtdDiesel = 0;

        while (tipo != 4) {
            if (tipo == 1) {
                qtdAlcool += 1;
                System.out.println("Tipo selecionado = Álcool");
            } else if (tipo == 2) {
                qtdGasolina += 1;
                System.out.println("Tipo selecionado = Gasolina");
            } else if (tipo == 3) {
                qtdDiesel += 1;
                System.out.println("Tipo selecionado = Diesel");
            } else {
                System.out.println("Digite um tipo válido.");
            }

            System.out.println("""
                    Selecione o tipo de combustível abaixo:\s
                    1 ----- Álcool
                    2 ----- Gasolina
                    3 ----- Diesel
                    4 ----- Sair do programa
                    """);

            System.out.print("Digite aqui: ");
            tipo = sc.nextInt();
        }

        System.out.printf("\nA quantidade de Álcool escolhidos foi: %d", qtdAlcool);
        System.out.printf("\nA quantidade de Gasolina escolhidos foi: %d", qtdGasolina);
        System.out.printf("\nA quantidade de Diesesl escolhidos foi: %d", qtdDiesel);
    }
}