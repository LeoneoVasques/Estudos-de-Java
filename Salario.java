import java.util.Locale;
import java.util.Scanner;
/*
Programa: Cálculo de Salário de Funcionário
Descrição: Lê o número do funcionário, a quantidade de horas trabalhadas e o valor da hora.
           Calcula o salário do funcionário multiplicando horas trabalhadas pelo valor da hora
           e exibe o número do funcionário e o salário calculado.
*/
public class Salario {

	public static void main(String[] args) {
		int numeroFuncionario, HorasTrabalhadas;
		double valorHora, salario;
		Locale.setDefault(Locale.US);

		System.out.println("Insira o número do Funcionário: ");
		Scanner sc = new Scanner(System.in);
		numeroFuncionario = sc.nextInt();
		System.out.println("Insira o número de horas trabalhadas: ");
		HorasTrabalhadas = sc.nextInt();
		System.out.println("Insira o valor hora do funcionário: ");
		valorHora = sc.nextDouble();
		sc.close();

		salario = HorasTrabalhadas * valorHora;

		System.out.printf("NUMBER = %d%n", numeroFuncionario);
		System.out.printf("SALARY = %.2f%n", salario);

	}

}
