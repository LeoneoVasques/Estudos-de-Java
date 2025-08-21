import java.util.Scanner;
/*
Programa: Verificação de Número Negativo
Descrição: Lê um número inteiro fornecido pelo usuário e verifica se ele é negativo ou não.
           Exibe "NEGATIVO" caso seja menor que zero, ou "NAO NEGATIVO" caso contrário.
*/
public class negativo {

	public static void main(String[] args) {
		System.out.println("Insira um número inteiro: ");
		Scanner sc = new Scanner(System.in);
		int inteiro;
		inteiro = sc.nextInt();
		sc.close();
		if (inteiro >= 0) {
			System.out.printf("NAO NEGATIVO");
		} else {
			System.out.printf("NEGATIVO");
		}
	}

}
