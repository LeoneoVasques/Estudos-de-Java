import java.util.Locale;
import java.util.Scanner;

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
