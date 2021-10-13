import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double A, B, C, MEDIA;
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextDouble();
		B = entrada.nextDouble();
		C = entrada.nextDouble();
		
		
		MEDIA = ((A * 2.0) + (B * 3.0) + (C * 5.0)) / 10.0;
		
		
		System.out.println("MEDIA = " + MEDIA);
		
		
		

	}
}
