import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/*
		int povoA = 80000;
		double taxaA = 3.0 / 100;
		int povoB = 200000;
		double taxaB = 1.5 / 100;
		
		int anos = 0;
		while(povoA < povoB) {
			povoA = (int) (povoA + (povoA * taxaA));
			povoB = (int) (povoB + (povoB * taxaB));
			anos ++;
			System.out.println(povoA + " < " + povoB);
		}
		System.out.println(povoA + " >= " + povoB);
		
		System.out.print("Levar� " + anos + " anos para que a popula��o do pa�s A ultrapasse a do pa�s B.");
		*/
		
		boolean condicao;
		char letra;
		do {
			int povoA;
			do {
				System.out.print("\nInforme a popula��o do pa�s A: ");
				povoA = entrada.nextInt();
			} while(povoA <= 0);
			
			double taxaA;
			do {
				System.out.print("Informe a taxa de crescimento do pa�s A: ");
				taxaA = (entrada.nextFloat()) / 100;
			} while(taxaA <= 0);
			
			int povoB;
			do {
				System.out.print("\nAgora, informe a popula��o do pa�s B: ");
				povoB = entrada.nextInt();
			} while(povoB <= 0);
			
			System.out.print("E, por fim, informe a taxa de crescimento do pa�s B: ");
			double taxaB = (entrada.nextFloat()) / 100;
			
			int anos = 0;
			while(povoA < povoB) {
				povoA = (int) (povoA + (povoA * taxaA));
				povoB = (int) (povoB + (povoB * taxaB));
				anos ++;
			}
			
			if(anos != 0)
				System.out.println("\nLevar� " + anos + " anos para que a popula��o do pa�s A ultrapasse a do pa�s B.");
			else
				System.out.println("\nA popula��o do pa�s A j� � maior que a do pa�s B.");
			
			do {
				System.out.print("\nDeseja continuar? (S/N) ");
				letra = entrada.next().charAt(0);
			} while(letra != 'S' && letra != 's' && letra != 'N' && letra != 'n');
			
			condicao = (letra == 'S') || (letra == 's');
		} while(condicao == true);
		
		System.out.print("Fim do programa.");
		
		entrada.close();
	}
}
