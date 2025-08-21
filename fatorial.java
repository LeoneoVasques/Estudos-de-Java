import java.util.Scanner;
/*
Programa: Cálculo de Fatorial
Descrição: Lê um número inteiro fornecido pelo usuário e calcula o seu fatorial.
           O fatorial de um número n é o produto de todos os inteiros de 1 até n (n!).
           Exibe o resultado na tela.
*/
public class fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int x = sc.nextInt();
		int fat = 1;
		for (int i = 1; i <= x; i++) {
			fat *= i;
		}
		sc.close();
		System.out.printf("%d", fat);
	}

}
