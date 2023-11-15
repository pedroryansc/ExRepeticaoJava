import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		int soma = 0;
		int maior = 0;
		int menor = 0;
		
		char letra;
		boolean continuar;
		
		do {
			System.out.print("Insira um número: ");
			num = entrada.nextInt();
			
			if(soma == 0) {
				maior = num;
				menor = num;
			} else {
				if(num > maior)
					maior = num;
				else if(num < menor)
					menor = num;
			}
			
			soma = soma + num;
			
			do {
				System.out.print("Deseja continuar? (S/N) ");
				letra = entrada.next().charAt(0);
			} while(letra != 'S' && letra != 's' && letra != 'N' && letra != 'n');
			
			continuar = letra == 'S' || letra == 's';
		} while(continuar == true);
		
		System.out.print("\nMenor valor: " + menor + "\n"
						+ "Maior valor: " + maior + "\n"
						+ "Soma dos valores: " + soma);
		
		entrada.close();
	}
}