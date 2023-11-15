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
		
		System.out.print("Levará " + anos + " anos para que a população do país A ultrapasse a do país B.");
		*/
		
		boolean condicao;
		char letra;
		do {
			int povoA;
			do {
				System.out.print("\nInforme a população do país A: ");
				povoA = entrada.nextInt();
			} while(povoA <= 0);
			
			double taxaA;
			do {
				System.out.print("Informe a taxa de crescimento do país A: ");
				taxaA = (entrada.nextFloat()) / 100;
			} while(taxaA <= 0);
			
			int povoB;
			do {
				System.out.print("\nAgora, informe a população do país B: ");
				povoB = entrada.nextInt();
			} while(povoB <= 0);
			
			System.out.print("E, por fim, informe a taxa de crescimento do país B: ");
			double taxaB = (entrada.nextFloat()) / 100;
			
			int anos = 0;
			while(povoA < povoB) {
				povoA = (int) (povoA + (povoA * taxaA));
				povoB = (int) (povoB + (povoB * taxaB));
				anos ++;
			}
			
			if(anos != 0)
				System.out.println("\nLevará " + anos + " anos para que a população do país A ultrapasse a do país B.");
			else
				System.out.println("\nA população do país A já é maior que a do país B.");
			
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
