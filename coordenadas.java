import java.util.Scanner;
/*
Programa: Identificação de Quadrante de Coordenadas
Descrição: Lê coordenadas X e Y fornecidas pelo usuário e determina em qual quadrante
           do plano cartesiano cada ponto se encontra (1º, 2º, 3º ou 4º quadrante).
           O programa continua pedindo coordenadas até que o usuário digite X = 0 ou Y = 0.
*/
public class coordenadas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x = 1, y = 1;
		while (x != 0 && y != 0) {
			System.out.println("Insira a coordenada X: ");
			x = sc.nextFloat();
			System.out.println("Insira a coordenada Y: ");
			y = sc.nextFloat();
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			if (x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			if (x > 0 && y < 0) {
				System.out.println("Quarto");
			}
		}
		sc.close();
	}

}
