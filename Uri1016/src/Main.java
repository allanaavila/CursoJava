import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int quilometros, minutos;

		Scanner entrada = new Scanner(System.in);

		quilometros = entrada.nextInt();

		minutos = (60 * quilometros) / 30;

		System.out.println(minutos + " minutos");

	}

}
