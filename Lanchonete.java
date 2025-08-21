import java.util.Scanner;
/*
Programa: Lanchonete – Cálculo de Pedido
Descrição: Exibe um cardápio com códigos, especificações e preços de produtos.
           Lê do usuário o código do produto desejado e a quantidade, calcula o total a pagar
           e exibe o valor final do pedido.
*/
public class Lanchonete {

	public static void main(String[] args) {
		int codigo1, codigo2;
		double cachorro_quente = 4.00;
		double xsalada = 4.50;
		double xbacon = 5.00;
		double torrada = 2.00;
		double refrigerante = 1.50;
		double total;
		Scanner sc = new Scanner(System.in);
		System.out.println("=====================================");
		System.out.println("CÓDIGO    ESPECIFICAÇÃO        PREÇO ");
		System.out.println("=====================================");
		System.out.println("1         Cachorro Quente      R$4.00");
		System.out.println("2         X-Salada             R$4.50");
		System.out.println("3         X-Bacon              R$5.00");
		System.out.println("4         Torrada Simples      R$2.00");
		System.out.println("5         Refrigerante         R$1.50");
		System.out.println("=====================================");
		System.out.println("Selecione o código do produto que deseja: ");
		codigo1 = sc.nextInt();
		System.out.println("Agora selecione a quantidade desse produto: ");
		codigo2 = sc.nextInt();
		sc.close();
		switch (codigo1) {
		case 1:
			total = cachorro_quente * codigo2;
			System.out.printf("O total é de: R$%.2f%n", total);
			break;
		case 2:
			total = xsalada * codigo2;
			System.out.printf("O total é de: R$%.2f%n", total);
			break;
		case 3:
			total = xbacon * codigo2;
			System.out.printf("O total é de: R$%.2f%n", total);
			break;
		case 4:
			total = torrada * codigo2;
			System.out.printf("O total é de: R$%.2f%n", total);
			break;
		case 5:
			total = refrigerante * codigo2;
			System.out.printf("O total é de: R$%.2f%n", total);
			break;
		}

	}

}
