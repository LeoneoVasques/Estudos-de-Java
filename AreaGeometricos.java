import java.util.Scanner;
import java.util.Locale;

public class AreaGeometricos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double a, b, c;
		System.out.println("Insira o primeiro valor: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		System.out.println("Insira o segundo valor: ");
		b = sc.nextDouble();
		System.out.println("Insira o terceiro valor: ");
		c = sc.nextDouble();
		sc.close();
		double areaTriangulo = (a * c) / 2;
		double areaCirculo = c * c * 3.14159;
		double areaTrapezio = ((a + b) / 2) * c;
		double areaQuadrado = b * b;
		double areaRetangulo = a * b;
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

	}

}
