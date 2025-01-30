import java.util.Scanner;

public class parimpar {

	public static void main(String[] args) {
		System.out.println("Insira um número inteiro: ");
		Scanner sc = new Scanner(System.in);
		int inteiro;
		inteiro = sc.nextInt();
		sc.close();
		if (inteiro%2==0) {
				System.out.println("O número é par");
		}
		else {
			System.out.println("O número é ímpar");
		}

	}

}
