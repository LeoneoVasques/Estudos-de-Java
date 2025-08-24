import java.util.Scanner;
import java.util.Random;
/*
Programa: Jogo de adivinhação
Descrição: Lê um numero inteiro e indica se acertou ou não
*/
public class aletorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int numero = rd.nextInt(51);
        System.out.println("Bem vindo ao jogo da adivinhação!");
        System.out.print("Digite um número de 1 a 50: ");
        int entrada = sc.nextInt();
        if (entrada == numero){
            System.out.println("Parabéns, você é acertou!");
        }
        else{
            System.out.println("Você errou!");
        }
        sc.close();
    }

}
