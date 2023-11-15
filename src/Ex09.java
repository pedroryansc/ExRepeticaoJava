import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int LIM = 10;
		
		int num;
		do {
			System.out.print("Insira um número de 1 a 10 para calcular sua tabuada: ");
			num = entrada.nextInt();
		} while(num < 1 || num > 10);
		
		System.out.println("\nTabuada do " + num);
		for(int x = 1; x <= LIM; x++)
			System.out.println(num + " x " + x + " = " + (num * x));
		
		entrada.close();
	}
}