import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um n�mero para gerar a sequ�ncia de Fibonacci at� este valor: ");
		int num = entrada.nextInt();
		
		int n1 = 0;
		int n2 = 1;
		int aux;
		
		for(int x = 1; x <= num; x++) {
			System.out.print("\n" + x + "� termo: " + n2);
			aux = n1 + n2;
			n1 = n2;
			n2 = aux;
		}
		
		entrada.close();
	}
}
