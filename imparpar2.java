import java.util.Scanner;

public class imparpar2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um valor inteiro: ");
		
		int inteiro = sc.nextInt();
		sc.close();
		for (int i = 1; i <= inteiro; i++) {
			
			if(i % 2 != 0) {
				System.out.printf("%d%n", i);
			}
		}

	}

}
