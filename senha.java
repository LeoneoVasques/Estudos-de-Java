import java.util.Scanner;

public class senha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a senha: ");
		int senha = 0;
		while (senha != 1263) {
			sc.close();
			if (senha != 1263) {
				System.out.println("Senha inválida!");
			}
		}
		System.out.println("Acesso permitido");
	}

}
