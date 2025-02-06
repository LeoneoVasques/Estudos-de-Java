import java.util.Scanner;

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
