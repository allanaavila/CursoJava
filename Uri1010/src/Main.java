import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int codigo1, codigo2, numero1, numero2;
		double valorUnitario1, valorUnitario2;
		double calculo1, calculo2, valorPagar;
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		codigo1 = entrada.nextInt();
		numero1 = entrada.nextInt();
		valorUnitario1 = entrada.nextDouble();
		
		
		codigo2 = entrada.nextInt();
		numero2 = entrada.nextInt();
		valorUnitario2 = entrada.nextDouble();
		
		
		calculo1 = numero1 * valorUnitario1;
		calculo2 = numero2 * valorUnitario2;
		
		valorPagar = calculo1 + calculo2;
		
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n" , valorPagar);
		
		
		
		
	}

}
