import java.util.Locale;
import java.util.Scanner;

public class IntervaloValor {

    public static void main(String[] args) {

     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);

     System.out.print("Digite um número qualquer: ");
     double numero = sc.nextDouble();

     sc.close();

     if (numero >= 0 && numero <= 25) {
         System.out.printf("\nO número %.2f está em um intervalo de [0, 25]", numero);
     } else if (numero > 25 && numero <= 50) {
         System.out.printf("\nO número %.2f está em um intervalo de [25, 50]", numero);
     } else if (numero > 50 && numero <= 75) {
         System.out.printf("\nO número %.2f está em um intervalo de [50,75]", numero);
     } else if (numero > 75 && numero <= 100) {
         System.out.printf("\nO número está em um intervalo de [75, 100]", numero);
     }
     else {
         System.out.println("Fora do intervalo.");
     }
     }
}