import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de termos da série 'n/m' para gerá-la: ");
		int quant = entrada.nextInt();

		for(int x = 1; x <= quant; x++) {
			float termo = (float) x / (x + (x - 1));
			System.out.print("\n" + x + "º termo: " + x + "/" + (x + (x - 1)) + " = " + termo);
		}
		
		entrada.close();
	}
}
