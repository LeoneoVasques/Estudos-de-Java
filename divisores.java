import java.util.Scanner;

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