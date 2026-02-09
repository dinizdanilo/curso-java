import java.util.Scanner;

public class CondicionalNegativos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        if (sc.hasNextInt()) {
            int numero = sc.nextInt();
                if (numero < 0) {
                    System.out.println("O número digitado é negativo.");
                }
                else {
                    System.out.println("O número digitado é positivo.");
                }
        }
        else {
            System.out.println("Digite apenas números inteiros!");
        }
        sc.close();
    }
}
