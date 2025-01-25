import java.util.Scanner;

public class AreaDoCirculo {

	public static void main(String[] args) {
		double raio;
		double pi = 3.14159;
		System.out.println("Insira o valor do raio do círculo: ");
		Scanner sc= new Scanner(System.in);
		raio = sc.nextDouble();
		sc.close();
		double resultado = raio * raio * pi;
		System.out.printf("A área do círculo é : %.4f%n", resultado);
		
	}

}
