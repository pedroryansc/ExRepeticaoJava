import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a base: ");
		double base = entrada.nextInt();
		System.out.print("Insira o expoente: ");
		double exp = entrada.nextInt();
		
		double num = 1;
		for(int x = 1; x <= exp; x++) {
			num = num * base;
		}
		
		System.out.print("\n" + base + " elevado a " + exp + " = " + num);
		
		entrada.close();
	}
}