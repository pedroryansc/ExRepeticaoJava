import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira seu nome de usuário: ");
		String usuario = entrada.nextLine();
		System.out.print("Insira sua senha: ");
		String senha = entrada.nextLine();
		
		while(usuario.equals(senha)) {
			System.out.print("Erro: a senha não pode ser igual ao nome de usuário. Insira outra senha: ");
			senha = entrada.nextLine();
		}
		
		System.out.print("\nNome de usuário: " + usuario + "\n"
						+ "Senha: " + senha);
		
		entrada.close();
	}
}
