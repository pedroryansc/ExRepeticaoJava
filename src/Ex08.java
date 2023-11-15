import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número inteiro: ");
		int n1 = entrada.nextInt();
		System.out.print("Insira o segundo número inteiro: ");
		int n2 = entrada.nextInt();
		while(n2 < n1) {
			System.out.print("O segundo número deve ser maior que o primeiro. Insira outro número: ");
			n2 = entrada.nextInt();
		}
		
		int soma = 0;
		
		System.out.print("\nNúmeros inteiros presentes no intervalo de [" + n1 + ", " + n2 + "]: ");
		for(int x = n1; x <= n2; x ++) {
			System.out.print(x + " ");
			soma = soma + x;
		}
		System.out.print("\nSoma dos números do intervalo: " + soma);
		
		entrada.close();
	}
}
