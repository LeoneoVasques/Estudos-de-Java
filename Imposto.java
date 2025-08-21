import java.util.Scanner;
/*
Programa: Cálculo de Imposto de Renda
Descrição: Lê o valor do salário do usuário e calcula o imposto de renda devido
           de acordo com faixas progressivas:
           - Até 2000: isento
           - De 2000,01 até 3000: 8%
           - De 3000,01 até 4500: 18%
           - Acima de 4500: 28%
           Exibe o valor do imposto ou "Isento" se não houver imposto a pagar.
*/
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
