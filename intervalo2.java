import java.util.Scanner;

public class intervalo2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = 0;
		int out = 0;
		int x = sc.nextInt();
		for (int i = 0; i < x; i++){
		    int y = sc.nextInt();
		    if (y >= 10 && y <= 20){
		        in += 1;
		    }
		    else{
		        out += 1;
		    }
		}
		sc.close();
		System.out.println(in + " in");
		System.out.println(out + " out");
	}
}
