import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int quant;
		do {
			System.out.print("Informe a quantidade de notas a ser inserida: ");
			quant = entrada.nextInt();
		} while(quant < 1);
		
		float soma = 0;
		
		for(int x = 1; x <= quant; x++) {
			System.out.print("Insira a " + x + "ª nota: ");
			soma = soma + entrada.nextFloat();
		}
		
		float media = soma / quant;
		
		System.out.print("\nA média aritmética do aluno foi de " + media + ".");
		
		entrada.close();
	}
}