import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double A, B, C;
		double triangulo, circulo, trapezio, quadrado, retangulo;

		Scanner entrada = new Scanner(System.in);

		A = entrada.nextDouble();
		B = entrada.nextDouble();
		C = entrada.nextDouble();

		triangulo = (A * C) / 2.0;
		circulo = 3.14159 * (C * C);
		trapezio = ((A + B) * C) / 2.0;
		quadrado = B * B;
		retangulo = A * B;

		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

	}

}
