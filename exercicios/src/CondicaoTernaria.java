import java.util.Scanner;

public class CondicaoTernaria {

    public static void main (String[] args ) {

        Scanner sc = new Scanner(System.in);

//        double preco = 34.5;
//        double desconto;
//        if (preco < 20) {
//            desconto = preco * 0.1;
//        }
//        else {
//            desconto  = preco * 0.05;
//        }

        double preco = 34.5;
//                                       se preço < 20 | se preço > 20
        double desconto = (preco < 20) ? preco * 0.01 : preco * 0.05;

        System.out.println(desconto);
        sc.close();
    }
}
