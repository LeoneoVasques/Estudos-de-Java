import java.util.Scanner;
/*
Programa: Cálculo do Valor de Peças
Descrição: Lê os códigos, quantidades e valores de dois produtos fornecidos pelo usuário,
           calcula o valor total a pagar e exibe o resultado na tela.
*/
public class ValorDePecas {

	public static void main(String[] args) {
		int cod1, cod2, num1, num2;
		double valor1, valor2, valorTotal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o código do primeiro produto seguido da quantidade e valor: ");
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		valor1 = sc.nextDouble();
		System.out.println("Insira o código do segundo produto seguido da quantidade e valor: ");
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextDouble();
		sc.close();
		valorTotal = (num1 * valor1) + (num2 * valor2);
		System.out.printf("VALOR A PAGAR: R$%.2f%n", valorTotal);
	}

}
