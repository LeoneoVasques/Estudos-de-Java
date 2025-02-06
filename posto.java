import java.util.Scanner;

public class posto {

	public static void main(String[] args) {
		int codigo = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("=====================");
		System.out.println("CÓDIGO |  COMBUSTÍVEL");
		System.out.println("=====================");
		System.out.println("   1   |  Álcool     ");
		System.out.println("   2   |  Gasolina   ");
		System.out.println("   3   |  Diesel     ");
		System.out.println("   4   |  Fim        ");
		System.out.println("=====================");
		System.out.println("Selecione o código do produto que deseja: ");
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (true) {
			codigo = sc.nextInt(); // input
			switch (codigo) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			}
			if (codigo == 4) {
				System.out.println("MUITO OBRIGADO");
				System.out.printf("Álcool: %d%n", alcool);
				System.out.printf("Gasolina: %d%n", gasolina);
				System.out.printf("Diesel: %d%n", diesel);
				break;
			}
			if (codigo != 4 && codigo != 3 && codigo != 2 && codigo != 1) {
				System.out.println("INSIRA UM CÓDIGO VÁLIDO"); 
			}
		}
		sc.close();
	} 

}
