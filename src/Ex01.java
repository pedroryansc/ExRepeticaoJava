import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira uma nota de zero a dez: ");
		float nota = entrada.nextFloat();
		while(nota < 0 || nota > 10) {
			System.out.print("Número inválido (" + nota + "). Insira uma nota de zero a dez: ");
			nota = entrada.nextFloat();
		}
		System.out.print("\nNúmero válido (" + nota + ").");
		
		entrada.close();
	}
}