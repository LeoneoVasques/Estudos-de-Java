import java.util.Scanner;

public class Imposto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor do salário: ");
		double salario = sc.nextDouble();
		double imposto = 0;
		sc.close();

		if (salario > 4500) {
			imposto += (salario - 4500) * 0.28;
			salario = 4500;

		}
		if (salario > 3000) {
			imposto += (salario - 3000) * 0.18;
			salario = 3000;

		}
		if (salario > 2000) {
			imposto += (salario - 2000) * 0.08;

		}
		if (imposto == 0) {
			System.out.println("Isento");
		} else {
			System.out.printf("O valor do imposto é: R$ %.2f%n", imposto);
		}
	}
}
