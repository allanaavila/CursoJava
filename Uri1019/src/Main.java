import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int N, horas, minutos, segundos, resto;

		N = entrada.nextInt();

		horas = N / 3600;
		resto = N % 3600;
		minutos = resto / 60;
		segundos = resto % 60;

		System.out.println(horas + ":" + minutos + ":" + segundos);

	}

}
