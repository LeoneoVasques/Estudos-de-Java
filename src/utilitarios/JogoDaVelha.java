    import java.util.Scanner;

    public class JogoDaVelha {
        static public int jogador = 1;
        static boolean win  = false;
        static boolean cheio  = false;
        static char[][] tabuleiro = new char[3][3];

        public void setTabuleiro() {    //cira o tabuleiro com valores em branco
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tabuleiro[i][j] = ' ';
                }
            }
        }

        public void showTabuleiro(){    //imprime o tabuleiro atualizado no terminal
            System.out.printf("| %c | %c | %c |%n", tabuleiro[0][0], tabuleiro[0][1], tabuleiro[0][2]);
            System.out.printf("| %c | %c | %c |%n", tabuleiro[1][0], tabuleiro[1][1], tabuleiro[1][2]);
            System.out.printf("| %c | %c | %c |%n", tabuleiro[2][0], tabuleiro[2][1], tabuleiro[2][2]);
            if (win){
                jogador = jogador - 1; //acerta o jogador que ganhou
            }
            if (cheio && !win){
                System.out.println("Deu Velha!");
            }
        }

        public void verifyCheio(){
            cheio = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tabuleiro[i][j] == ' ') {
                        cheio = false;
                        return;
                    }
                }
            }
        }

        public void verifyWin(){    //verifica se alguem venceu
                if (tabuleiro[0][0] != ' ' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]){  //verifica na diagonal principal
                    win = true;
                    showTabuleiro();
                    System.out.printf("Jogador %d venceu!%n", jogador);
        }       if (tabuleiro[1][1] != ' ' && tabuleiro[2][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[0][2]) {  //verifica na diagonal secundaria
                    win = true;
                    showTabuleiro();
                    System.out.printf("Jogador %d venceu!%n", jogador);
            }
                    for (int i = 0; i < 3; i++) {   //verifica nas linhas
                        if (tabuleiro[i][0] != ' ' && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]){
                            win = true;
                            showTabuleiro();
                            System.out.printf("Jogador %d venceu!%n", jogador);
                        };
                    }
                    for (int j = 0; j < 3; j++) {   //verifica nas colunas
                        if (tabuleiro[0][j] != ' ' && tabuleiro[0][j] == tabuleiro[1][j] && tabuleiro[1][j] == tabuleiro[2][j]){
                            win = true;
                            showTabuleiro();
                            System.out.printf("Jogador %d venceu!%n", jogador);
                        };
                }
        }

        public void jogada(int x, int y){
            int qual_jogador = jogador % 2;
                if (qual_jogador != 0) {
                    if (x == 1 && y == 1) tabuleiro[0][0] = 'X';
                    if (x == 1 && y == 2) tabuleiro[0][1] = 'X';
                    if (x == 1 && y == 3) tabuleiro[0][2] = 'X';

                    if (x == 2 && y == 1) tabuleiro[1][0] = 'X';
                    if (x == 2 && y == 2) tabuleiro[1][1] = 'X';
                    if (x == 2 && y == 3) tabuleiro[1][2] = 'X';

                    if (x == 3 && y == 1) tabuleiro[2][0] = 'X';
                    if (x == 3 && y == 2) tabuleiro[2][1] = 'X';
                    if (x == 3 && y == 3) tabuleiro[2][2] = 'X';
                    jogador++;
                }
                else{
                    if (x == 1 && y == 1) tabuleiro[0][0] = 'O';
                    if (x == 1 && y == 2) tabuleiro[0][1] = 'O';
                    if (x == 1 && y == 3) tabuleiro[0][2] = 'O';

                    if (x == 2 && y == 1) tabuleiro[1][0] = 'O';
                    if (x == 2 && y == 2) tabuleiro[1][1] = 'O';
                    if (x == 2 && y == 3) tabuleiro[1][2] = 'O';

                    if (x == 3 && y == 1) tabuleiro[2][0] = 'O';
                    if (x == 3 && y == 2) tabuleiro[2][1] = 'O';
                    if (x == 3 && y == 3) tabuleiro[2][2] = 'O';
                    jogador++;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            JogoDaVelha jogo = new JogoDaVelha();
            System.out.printf("Bem vindo ao jogo da velha!%n");
            jogo.setTabuleiro();
            while (!win && !cheio) {
                jogo.showTabuleiro();
                if (jogador % 2 != 0) {jogador = 1;}
                if (jogador % 2 == 0) {jogador = 2;}
                System.out.printf("Jogador %d, insira o número da linha: %n", jogador);
                int linha = sc.nextInt();
                System.out.printf("Jogador %d, insira o número da coluna: %n", jogador);
                int coluna = sc.nextInt();
                if ((coluna != 1 && coluna != 2 && coluna != 3) || (linha != 1 && linha != 2 && linha != 3)){
                    System.out.println("Jogada inválida!");
                    continue;
                }
                if (tabuleiro[linha-1][coluna-1] != ' '){
                    System.out.println("Jogada inválida!");
                }
                else {
                        jogo.jogada(linha, coluna);
                        jogo.verifyWin();
                        jogo.verifyCheio();
                        jogo.showTabuleiro();
                }
            }
                sc.close();
        }
    }