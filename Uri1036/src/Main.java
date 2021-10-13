import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double A, B, C;
		double delta;

		A = entrada.nextDouble();
		B = entrada.nextDouble();
		C = entrada.nextDouble();

		delta = Math.pow(B, 2) - (4 * A * C);

		if ((A == 0) || (delta < 0)) {
			System.out.println("Impossivel calcular");
		} else {
			double R1 = (((-1 * B) + Math.pow(delta, 0.5)) / (2 * A));
			double R2 = (((-1 * B) - Math.pow(delta, 0.5)) / (2 * A));
			System.out.printf("R1 = %.5f\n", R1);
			System.out.printf("R2 = %.5f\n", R2);
		}

	}

}
