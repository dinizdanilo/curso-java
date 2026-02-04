import java.util.Scanner;

public class ExercicioSoma {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int x = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        System.out.printf("Você digitou %d e %d%n", x, b);

        int soma = (x + b);

        System.out.printf("%nA soma desses dois números é igual a: " + soma);
    }
}