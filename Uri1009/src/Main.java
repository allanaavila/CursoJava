import java.util.Locale;
	import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		String nome;
		double salariofixo, qtdevendas, total,bonus;
		
		
		Scanner entrada = new Scanner(System.in);
		
		nome = entrada.next();
		salariofixo = entrada.nextDouble();
		qtdevendas = entrada.nextDouble();
		
		bonus = (qtdevendas * (15/100));
		total = salariofixo + bonus;
		
		
		System.out.printf("TOTAL = %.2f%n", total);
		
		

	}

}
