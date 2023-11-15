import java.util.Scanner;

public class Ex17 {
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
		else
			System.out.print("\nO número " + num + " não é primo.");
		
		/*
		for(int x = 2; x <= 1000; x++) {
			if(x == 2 || x == 3 || x == 5 || x == 7)
				System.out.println(x);
			else if(x % 2 != 0 && x % 3 != 0 && x % 5 != 0 && x % 7 != 0)
				System.out.println(x);
		}
		*/
		
		entrada.close();
	}
}