import java.util.Scanner;
/*
Programa: Calculadora de IMC
Descrição: Lê o nome, altura e peso do usuário, calcula o Índice de Massa Corporal (IMC)
           usando a fórmula IMC = peso / (altura²) e informa em qual faixa de peso a pessoa se encontra,
           de acordo com os padrões de classificação de IMC.
*/
public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de IMC");
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextFloat();
        System.out.println("Digite sua peso: ");
        double peso = sc.nextFloat();
        String resultado = "";
        double imc = peso / (altura * altura);
        if (imc < 17) {
            resultado = "muito abaixo do peso ideal.";
        } else if (imc < 18.5 && imc >= 17) {
            resultado = "abaixo do peso.";
        } else if (imc < 25 && imc >= 18.5) {
            resultado = "peso ideal.";
        } else if (imc < 30 && imc >= 25) {
            resultado = "acima do peso.";
        } else if (imc < 35 && imc >= 30) {
            resultado = "obesidade grau 1.";
        } else if (imc < 40 && imc >= 35) {
            resultado = "obesidade grau 2.";
        } else if (imc >= 40) {
            resultado = "obesidade grau 3 (mórbida).";
        }
        System.out.printf("%s, seu IMC é: %.2f%n", nome, imc);
        System.out.println("Você se encontra em estado de " + resultado);
        sc.close();
    }
}
