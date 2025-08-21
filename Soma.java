import java.util.Scanner;
/*
Programa: Soma de Dois Números
Descrição: Lê dois números inteiros fornecidos pelo usuário, calcula a soma deles
           e exibe o resultado na tela.
*/
public class Soma {

	public static void main(String[] args) {
		int a, b;
		System.out.println("Insira um número: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Insira outro número: ");
		b = sc.nextInt();
		sc.close();
		int resultado = a + b;
		System.out.printf("A soma dos dois valores é: %d%n", resultado);
	}

}
