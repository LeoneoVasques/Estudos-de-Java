import java.util.Scanner;

public class horasJogo {

	public static void main(String[] args) {
		int horaI, horaF, duracao;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o horario incial do jogo: ");
		horaI = sc.nextInt();
		System.out.println("Insira o horario final do jogo: ");
		horaF = sc.nextInt();
		sc.close();
		if (horaF > horaI) {
			duracao = horaF - horaI;
			System.out.println("O jogo durou: " + duracao);
		} else if (horaF < horaI) {
			duracao = horaF - horaI + 24;
			System.out.println("O jogo durou: " + duracao);
		} else {
			System.out.println("O jogo durou: 24 horas");
		}

	}
}