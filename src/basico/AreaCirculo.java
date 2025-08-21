package utilitarios;
import java.util.Scanner;
/*
Programa: Cálculo da Área de um Círculo
Descrição: Lê o valor do raio de um círculo e calcula sua área usando a fórmula
           área = π * raio². Exibe o resultado na tela com 4 casas decimais.
*/
public class AreaCirculo {

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
