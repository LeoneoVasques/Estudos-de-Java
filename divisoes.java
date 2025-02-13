import java.util.Scanner;
import java.util.Locale;

public class divisoes {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		System.out.println("insira a quantidade de processos desejados: ");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println("insira o primeiro valor: ");
			double a = sc.nextDouble();
			System.out.println("insira o segundo valor: ");
			double b = sc.nextDouble();
			if (b == 0) {
				System.out.println("Divisão impossível!");
			} else {
				double resultado = a / b;
				System.out.printf("A divisão de %f por %f é: %f%n", a, b, resultado);
			}

		}
		sc.close();
	}
}
