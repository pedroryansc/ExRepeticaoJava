import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int LIM = 10;
		
		int[] num = new int[LIM];
		int par = 0;
		int impar = 0;
		
		for(int x = 0; x < LIM; x++) {
			System.out.print("Informe o " + (x + 1) + "� n�mero: ");
			num[x] = entrada.nextInt();
			if(num[x] % 2 == 0)
				par++;
			else
				impar++;
		}
		
		System.out.print("\nQuantidade de n�meros pares: " + par + "\n"
						+ "Quantidade de n�meros �mpares: " + impar);
		
		entrada.close();
	}
}