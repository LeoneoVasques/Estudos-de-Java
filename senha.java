import java.util.Scanner;
/*
Programa: Validação de Senha
Descrição: Solicita que o usuário insira uma senha e continua pedindo até que a senha correta (1263) seja informada.
           Quando a senha correta é digitada, exibe a mensagem "Acesso permitido".
*/
public class senha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a senha: ");
		int senha = 0;
		while (senha != 1263) {
			senha = sc.nextInt();
			if (senha != 1263) {
				System.out.println("Senha inválida! Tente novamente.");
			}
		}
		sc.close();
		System.out.println("Acesso permitido");
	}

}
