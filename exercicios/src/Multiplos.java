import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numeroA = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numeroB = sc.nextInt();

        sc.close();

        if (numeroA > numeroB) {
           if (numeroA % numeroB == 0) {
               System.out.printf("\nOs números %d e %d são múltiplos.", numeroB, numeroA);
           }
           else {
               System.out.printf("\nOs números %d e %d não são múltiplos.", numeroB, numeroA);
           }
        }
        else {
            if (numeroB % numeroA == 0) {
               System.out.printf("\nOs números %d e %d são múltiplos.", numeroA, numeroB);
            }
            else {
                System.out.printf("\nOs números %d e %d não são múltiplos.", numeroA, numeroB);
            }
        }
    }
}