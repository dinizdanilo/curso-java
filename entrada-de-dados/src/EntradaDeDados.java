import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		int z;
		z = sc.nextInt();
		System.out.println("Você digitou: " + z);
		
		double c;
		c = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", c);
		
		char v;
		v = sc.next().charAt(0);
		System.out.println("Você digitou: " + v);
		
		String b;
		int n;
		double m;
		b = sc.next();
		n = sc.nextInt();
		m = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(b);
		System.out.println(n);
		System.out.println(m);
		
		sc.close();
	}	
}