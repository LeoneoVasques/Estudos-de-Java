import java.util.Scanner;

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
