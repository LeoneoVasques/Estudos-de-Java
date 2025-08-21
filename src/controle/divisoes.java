import java.util.Scanner;
import java.util.Locale;
/*
Programa: Divisão de Números
Descrição: Lê uma quantidade de processos definida pelo usuário. Para cada processo,
           solicita dois números (a e b) e realiza a divisão a / b.
           Se o segundo número for zero, exibe uma mensagem de "Divisão impossível".
           Caso contrário, exibe o resultado da divisão.
*/
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
