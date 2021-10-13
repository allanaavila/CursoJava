import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int funcionario, horas;
		double valor, salario;
		
		
		Scanner entrada = new Scanner(System.in);
		
		funcionario = entrada.nextInt();
		horas = entrada.nextInt();
		valor = entrada.nextDouble();
		
		salario = (horas * valor);
		
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		

	}

}
