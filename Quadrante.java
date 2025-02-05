import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor de X: ");
		double x = sc.nextDouble();
		System.out.println("Insira o valor de Y: ");
		double y = sc.nextDouble();
		sc.close();
		if (x > 0 && y > 0) {
			System.out.println("O valor está no Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("O valor está no Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("O valor está no Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("O valor está no Q4");
		} else if (x == 0 && y != 0) {
			System.out.println("O valor está no eixo Y");
		} else if (y == 0 && x != 0) {
			System.out.println("O valor está no eixo Y");
		} else {
			System.out.println("O valor é a origem");
		}
	}

}
