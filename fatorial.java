import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int x = sc.nextInt();
		int fat = 1;
		for (int i = 1; i <= x; i++) {
			fat *= i;
		}
		sc.close();
		System.out.printf("%d", fat);
	}

}
