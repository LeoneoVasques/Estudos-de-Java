import java.util.Scanner;
import java.util.Locale;
/*
Programa: Verificação de Intervalo
Descrição: Lê um número fornecido pelo usuário e verifica em qual intervalo ele se encontra:
           [0,25], (25,50], (50,75], (75,100].
           Se o número não estiver dentro de nenhum desses intervalos, exibe que está fora do intervalo.
*/
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