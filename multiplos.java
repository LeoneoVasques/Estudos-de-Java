import java.util.Scanner;
/*
Programa: Verificação de Múltiplos
Descrição: Lê dois números inteiros fornecidos pelo usuário e verifica se eles são múltiplos entre si.
           Exibe uma mensagem indicando se são ou não múltiplos.
*/
public class multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Insira um número inteiro: ");
		a = sc.nextInt();
		System.out.println("Insira outro número inteiro: ");
		b = sc.nextInt();
		sc.close();
		if (a % b == 0 || b % a == 0) {
			System.out.println("Os números são mútiplos!");
		} else {
			System.out.println("Os números não são mútiplos!");

		}
	}

}
