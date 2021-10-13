import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double tempo, hora, km_litro = 12;
		double resultado;

		Scanner ler = new Scanner(System.in);

		tempo = ler.nextInt();
		hora = ler.nextInt();
		resultado = (tempo * hora) / km_litro;

		System.out.println(String.format("%.3f", resultado));

	}

}
