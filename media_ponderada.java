import java.util.Scanner;
import java.util.Locale;

public class media_ponderada
{
	public static void main(String[] args) {
	    Locale.setDefault(new Locale("en", "US"));
	    Scanner sc = new Scanner(System.in);
	    System.out.println("insira a quantidade de processos desejados: ");
	    int x = sc.nextInt();
		for (int i = 0; i < x; i++){
            System.out.println("insira o primeiro valor (peso 2): ");
            double a = sc.nextDouble();
            System.out.println("insira o segundo valor (peso 3): ");
            double b = sc.nextDouble();
            System.out.println("insira o terceiro valor (peso 5): ");
            double c = sc.nextDouble();
            double media_ponderada = ((a * 2)+(b * 3)+(c * 5))/ ( 2 + 3 + 5);
            System.out.printf("A média ponderada é: %.1f%n", media_ponderada);
        }
            sc.close();
	}
}
