import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int A,B,C;
		int maiorAB;
		
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();
		
		
		maiorAB = (A + B + Math.abs(A - B)) / 2;
		maiorAB = (C + maiorAB + Math.abs(maiorAB - C))/2;
		
		System.out.println(maiorAB + (" eh o maior"));

	}

}
