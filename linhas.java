import java.util.Scanner;
/*
Programa: Números, Quadrados e Cubos
Descrição: Lê um número inteiro N fornecido pelo usuário e, para cada número de 1 até N,
           exibe na tela o número, seu quadrado e seu cubo.
*/
public class linhas
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        for (int i = 1; i <= numero; i++){
            int i2 = i * i;
            int i3 = i * i * i;
            System.out.printf("%d %d %d%n", i, i2, i3);
        }
    }
}
