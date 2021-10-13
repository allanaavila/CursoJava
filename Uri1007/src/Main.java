import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A, B, C, D, DIFERENCA;
		
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();
		D = entrada.nextInt();
		
		
		DIFERENCA = (A * B - C * D);
		
		
		System.out.println("DIFERENCA = " + DIFERENCA);

	}

}
