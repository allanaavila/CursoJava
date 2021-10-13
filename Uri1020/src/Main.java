import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int N, dias, meses, anos;

		N = entrada.nextInt();

		anos = N / 365;
		meses = (N % 365) / 30;
		dias = (N % 365) % 30;

		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
	}

}
