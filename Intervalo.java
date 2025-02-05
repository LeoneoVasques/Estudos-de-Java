import java.util.Scanner;
import java.util.Locale;

public class Intervalo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número: ");
		double valor = sc.nextDouble();
		sc.close();
		if (valor >= 0 && valor <= 25) {
			System.out.println("O valor está no intervalo  [0,25].");
		} else if (valor > 25 && valor <= 50) {
			System.out.println("O valor está no intervalo  (25,50].");
		} else if (valor > 50 && valor <= 75) {
			System.out.println("O valor está no intervalo  (50,75].");
		} else if (valor > 75 && valor <= 100) {
			System.out.println("O valor está no intervalo  (75,100].");
		} else {
			System.out.println("O valor está fora de intervalo.");
		}
	}
}