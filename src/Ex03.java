import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		do {
			System.out.print("Insira seu nome (com mais de tr�s caracteres): ");
			nome = entrada.nextLine();
		} while(nome.length() <= 3);
		
		int idade;
		do {
			System.out.print("\nInsira sua idade (entre 0 e 150 anos): ");
			idade = entrada.nextInt();
		} while(idade < 0 || idade > 150);
		
		float salario;
		do {
			System.out.print("\nInsira seu sal�rio (maior que zero): ");
			salario = entrada.nextFloat();
		} while(salario <= 0);
		
		char genero;
		do {
			System.out.print("\nInsira seu g�nero ('m' para masculino, 'f' para feminino ou "
							+ "'n' caso prefira n�o informar): ");
			genero = entrada.next().charAt(0);
		} while(genero != 'f' && genero != 'm' && genero != 'n');
		
		char estadoCivil;
		do {
			System.out.print("\nInsira seu estado civil ('s', 'c', 'v' ou 'd'): ");
			estadoCivil = entrada.next().charAt(0);
		} while(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');
		
		System.out.print("\nNome: " + nome + "\n"
						+ "Idade: " + idade + "\n"
						+ "Sal�rio: " + salario + "\n"
						+ "G�nero: ");
		
		if(genero == 'f')
			System.out.println("Feminino");
		else if(genero == 'm')
			System.out.println("Masculino");
		else
			System.out.println("N�o informado");
		
		System.out.print("Estado civil: " + estadoCivil);
		
		
		entrada.close();
	}
}