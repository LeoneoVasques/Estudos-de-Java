import java.util.Scanner;
import java.util.Locale;

public class Dolar {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the dollar price? ");
        double dolar_price = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double qtd = sc.nextDouble();
        double resultado = CurrencyConverter.convert(dolar_price, qtd);
        System.out.printf("Amount to be paid in reais: %.2f%n", resultado);

    }
}

class CurrencyConverter{
    public static double convert(double dolar_price, double qtd){
        dolar_price = dolar_price * 106.0/100.0;
        return dolar_price * qtd;
    }
}
