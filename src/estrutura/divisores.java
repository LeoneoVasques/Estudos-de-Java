import java.util.Scanner;
/*
Programa: Divisores de um Número Inteiro
Descrição: Lê um número inteiro fornecido pelo usuário e exibe todos os seus divisores.
           Um divisor é todo número que divide o número dado sem deixar resto.
*/

public class divisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inisra um numero inteiro: ");
        int numero = sc.nextInt();
        sc.close();
        for (int i = 1; i <= numero ; i++){
            if(numero%i == 0) {
                System.out.printf("%d%n",i);
            }
        }
    }
}