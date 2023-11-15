import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		do {
			System.out.print("Insira seu nome (com mais de três caracteres): ");
			nome = entrada.nextLine();
		} while(nome.length() <= 3);
		
		int idade;
		do {
			System.out.print("\nInsira sua idade (entre 0 e 150 anos): ");
			idade = entrada.nextInt();
		} while(idade < 0 || idade > 150);
		
		float salario;
		do {
			System.out.print("\nInsira seu salário (maior que zero): ");
			salario = entrada.nextFloat();
		} while(salario <= 0);
		
		char genero;
		do {
			System.out.print("\nInsira seu gênero ('m' para masculino, 'f' para feminino ou "
							+ "'n' caso prefira não informar): ");
			genero = entrada.next().charAt(0);
		} while(genero != 'f' && genero != 'm' && genero != 'n');
		
		char estadoCivil;
		do {
			System.out.print("\nInsira seu estado civil ('s', 'c', 'v' ou 'd'): ");
			estadoCivil = entrada.next().charAt(0);
		} while(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');
		
		System.out.print("\nNome: " + nome + "\n"
						+ "Idade: " + idade + "\n"
						+ "Salário: " + salario + "\n"
						+ "Gênero: ");
		
		if(genero == 'f')
			System.out.println("Feminino");
		else if(genero == 'm')
			System.out.println("Masculino");
		else
			System.out.println("Não informado");
		
		System.out.print("Estado civil: " + estadoCivil);
		
		
		entrada.close();
	}
}