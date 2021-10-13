import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int raio;
		double volume, calculoRaio;

		Scanner entrada = new Scanner(System.in);

		raio = entrada.nextInt();

		calculoRaio = Math.pow(raio, 3);
		volume = (4.0 / 3.0) * 3.14159 * calculoRaio;

		System.out.printf("VOLUME = %.3f%n", volume);

	}

}
