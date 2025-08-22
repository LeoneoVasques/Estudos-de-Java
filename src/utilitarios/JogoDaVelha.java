import java.util.Scanner;

public class JogoDaVelha {
        static char vb = ' ';
        static char p11 = vb, p12 = vb, p13 = vb, p21 = vb, p22 = vb, p23 = vb, p31 = vb, p32 = vb, p33 = vb;
    public static void main(String[] args) {
        int coluna, linha;
        int repeat = 1;
        Scanner sc = new Scanner(System.in);
        while (repeat == 1) {
            show();
            System.out.printf("Bem vindo ao jogo da velha!%n");
            System.out.printf("Jogador 1, insira o número da linha: %n");
            linha = sc.nextInt();
            System.out.printf("Jogador 1, insira o número da coluna: %n");
            coluna = sc.nextInt();
            if (linha == 1 && coluna == 1) {p11 = 'X';}
            if (linha == 1 && coluna == 2) {p12 = 'X';}
            if (linha == 1 && coluna == 3) {p13 = 'X';}
            if (linha == 2 && coluna == 1) {p21 = 'X';}
            if (linha == 2 && coluna == 2) {p22 = 'X';}
            if (linha == 2 && coluna == 3) {p23 = 'X';}
            if (linha == 3 && coluna == 1) {p31 = 'X';}
            if (linha == 3 && coluna == 2) {p32 = 'X';}
            if (linha == 3 && coluna == 3) {p33 = 'X';}
            show();
            System.out.printf("Jogador 2, insira o número da linha: %n");
            linha = sc.nextInt();
            System.out.printf("Jogador 2, insira o número da coluna: %n");
            coluna = sc.nextInt();
            if (linha == 1 && coluna == 1) {p11 = 'O';}
            if (linha == 1 && coluna == 2) {p12 = 'O';}
            if (linha == 1 && coluna == 3) {p13 = 'O';}
            if (linha == 2 && coluna == 1) {p21 = 'O';}
            if (linha == 2 && coluna == 2) {p22 = 'O';}
            if (linha == 2 && coluna == 3) {p23 = 'O';}
            if (linha == 3 && coluna == 1) {p31 = 'O';}
            if (linha == 3 && coluna == 2) {p32 = 'O';}
            if (linha == 3 && coluna == 3) {p33 = 'O';}
            show();
            System.out.printf("Jogador 1, insira o número da linha: %n");
            linha = sc.nextInt();
            System.out.printf("Jogador 1, insira o número da coluna: %n");
            coluna = sc.nextInt();
            if (linha == 1 && coluna == 1) {p11 = 'X';}
            if (linha == 1 && coluna == 2) {p12 = 'X';}
            if (linha == 1 && coluna == 3) {p13 = 'X';}
            if (linha == 2 && coluna == 1) {p21 = 'X';}
            if (linha == 2 && coluna == 2) {p22 = 'X';}
            if (linha == 2 && coluna == 3) {p23 = 'X';}
            if (linha == 3 && coluna == 1) {p31 = 'X';}
            if (linha == 3 && coluna == 2) {p32 = 'X';}
            if (linha == 3 && coluna == 3) {p33 = 'X';}
            show();
            System.out.printf("Jogador 1, insira o número da linha: %n");
            linha = sc.nextInt();
            System.out.printf("Jogador 1, insira o número da coluna: %n");
            coluna = sc.nextInt();
            if (linha == 1 && coluna == 1) {p11 = 'X';}
            if (linha == 1 && coluna == 2) {p12 = 'X';}
            if (linha == 1 && coluna == 3) {p13 = 'X';}
            if (linha == 2 && coluna == 1) {p21 = 'X';}
            if (linha == 2 && coluna == 2) {p22 = 'X';}
            if (linha == 2 && coluna == 3) {p23 = 'X';}
            if (linha == 3 && coluna == 1) {p31 = 'X';}
            if (linha == 3 && coluna == 2) {p32 = 'X';}
            if (linha == 3 && coluna == 3) {p33 = 'X';}
            show();
            System.out.printf("Jogador 1, insira o número da linha: %n");
            linha = sc.nextInt();
            System.out.printf("Jogador 1, insira o número da coluna: %n");
            coluna = sc.nextInt();
            if (linha == 1 && coluna == 1) {p11 = 'X';}
            if (linha == 1 && coluna == 2) {p12 = 'X';}
            if (linha == 1 && coluna == 3) {p13 = 'X';}
            if (linha == 2 && coluna == 1) {p21 = 'X';}
            if (linha == 2 && coluna == 2) {p22 = 'X';}
            if (linha == 2 && coluna == 3) {p23 = 'X';}
            if (linha == 3 && coluna == 1) {p31 = 'X';}
            if (linha == 3 && coluna == 2) {p32 = 'X';}
            if (linha == 3 && coluna == 3) {p33 = 'X';}
            show();
            if (p11 == p12 && p12 == p13) {
                System.out.printf("Pabens");
            }
            p11 = vb; p12 = vb; p13 = vb; p21 = vb; p22 = vb; p23 = vb; p31 = vb; p32 = vb; p33 = vb;
            System.out.printf("Pressione 1 para jogar novamente: ");
            repeat = sc.nextInt();

        }
    }

    public static void show() {
                System.out.printf("| %c | %c | %c |%n", p11, p12, p13);
                System.out.printf("| %c | %c | %c |%n", p21, p22, p23);
                System.out.printf("| %c | %c | %c |%n", p31, p32, p33);
        }
    }