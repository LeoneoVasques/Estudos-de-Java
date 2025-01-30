
import java.util.Scanner;

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
