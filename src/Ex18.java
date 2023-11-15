import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num;
		do {
			System.out.print("Insira um número inteiro maior que 1 para verificar se ele é primo: ");
			num = entrada.nextInt();
		} while(num <= 1);
		
		if(num == 2 || num == 3 || num == 5 || num == 7)
			System.out.print("\nO número " + num + " é primo.");
		else if(num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0)
			System.out.print("\nO número " + num + " é primo.");
		else {
			System.out.print("\nO número " + num + " não é primo, pois ele é divisível por: ");
			for(int x = 1; x <= (num / 2); x++) {
				if(num % x == 0) {
					if(x == 1)
						System.out.print(x);
					else
						System.out.print(", " + x);
				}
			}
			System.out.print(" e " + num + ".");
		}
		
		entrada.close();
	}
}