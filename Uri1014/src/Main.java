import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int x;
		double y;

		Scanner entrada = new Scanner(System.in);

		x = entrada.nextInt();
		y = entrada.nextDouble();

		System.out.printf("%.3f km/l\n", x / y);

	}

}
