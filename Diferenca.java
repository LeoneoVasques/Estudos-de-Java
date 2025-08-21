import java.util.Scanner;
/*
Programa: Cálculo de Diferença
Descrição: Lê quatro valores inteiros (a, b, c, d) fornecidos pelo usuário e calcula a diferença
           entre o produto dos dois primeiros e o produto dos dois últimos, ou seja:
           diferença = (a * b) - (c * d). Exibe o resultado na tela.
*/
public class Diferenca {

	public static void main(String[] args) {
		int a, b, c, d, diferenca;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o primeiro valor: ");
		a = sc.nextInt();
		System.out.println("Insira o segundo valor: ");
		b = sc.nextInt();
		System.out.println("Insira o terceiro valor: ");
		c = sc.nextInt();
		System.out.println("Insira o quarto valor: ");
		d = sc.nextInt();
		sc.close();
		diferenca = (a * b) - (c * d);
		System.out.printf("A diferença é: %d%n", diferenca);
		

	}

}
