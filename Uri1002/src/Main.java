import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio, area;

		raio = sc.nextDouble();

		area = 3.14159 * (raio * raio);

		System.out.printf("A=%.4f%n ", area);
	}

}
