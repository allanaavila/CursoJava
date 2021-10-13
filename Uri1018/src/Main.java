import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int N, valor;
		int nota100, nota50, nota20, nota10, nota5, nota2, nota1;

		N = entrada.nextInt();

		valor = N;

		nota100 = N / 100;
		N %= 100;

		nota50 = N / 50;
		N %= 50;

		nota20 = N / 20;
		N %= 20;

		nota10 = N / 10;
		N %= 10;

		nota5 = N / 5;
		N %= 5;

		nota2 = N / 2;
		N %= 2;

		nota1 = N;

		System.out.println(valor);
		System.out.println(nota100 + " nota(s) de R$ 100,00");
		System.out.println(nota50 + " nota(s) de R$ 50,00");
		System.out.println(nota20 + " nota(s) de R$ 20,00");
		System.out.println(nota10 + " nota(s) de R$ 10,00");
		System.out.println(nota5 + " nota(s) de R$ 5,00");
		System.out.println(nota2 + " nota(s) de R$ 2,00");
		System.out.println(nota1 + " nota(s) de R$ 1,00");

	}

}
