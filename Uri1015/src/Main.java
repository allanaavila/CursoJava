import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		float x1, y1, x2, y2, distancia;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		x1 = sc.nextFloat();
		y1 = sc.nextFloat();
		x2 = sc.nextFloat();
		y2 = sc.nextFloat();
		
		
		distancia = (float) Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0));
		
		
		System.out.printf("%.4f ", distancia);
		

	}

}
