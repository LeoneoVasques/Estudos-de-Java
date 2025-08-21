import java.util.Scanner;
/*
Programa: Identificação de Quadrante ou Eixo
Descrição: Lê coordenadas X e Y fornecidas pelo usuário e determina em qual quadrante
           do plano cartesiano o ponto se encontra (Q1, Q2, Q3, Q4), ou se está em algum
           dos eixos (X ou Y) ou na origem.
*/
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
