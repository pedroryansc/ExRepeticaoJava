import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro n�mero inteiro: ");
		int n1 = entrada.nextInt();
		System.out.print("Insira o segundo n�mero inteiro: ");
		int n2 = entrada.nextInt();
		while(n2 < n1) {
			System.out.print("O segundo n�mero deve ser maior que o primeiro. Insira outro n�mero: ");
			n2 = entrada.nextInt();
		}
		
		int soma = 0;
		
		System.out.print("\nN�meros inteiros presentes no intervalo de [" + n1 + ", " + n2 + "]: ");
		for(int x = n1; x <= n2; x ++) {
			System.out.print(x + " ");
			soma = soma + x;
		}
		System.out.print("\nSoma dos n�meros do intervalo: " + soma);
		
		entrada.close();
	}
}
