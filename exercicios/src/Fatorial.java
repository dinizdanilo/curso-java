import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor N: ");
        int N = sc.nextInt();

        long fatorial = 1;
        if (N == 0) {
            System.out.println("O fatorial de " + N + " é: " + fatorial);
        }
        else {
            for (int i = 1; i <= N; i++) {
                fatorial *= i;
                System.out.println("O fatorial de " + N + " é: " + fatorial);

            }
        }
    }
}