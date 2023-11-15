import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		do {
			System.out.print("Informe o n�mero m�ximo de um intervalo para verificar quais s�o os n�meros "
							+ "primos presentes em tal intervalo: ");
			num = entrada.nextInt();
		} while(num <= 1);
		
		boolean primo;
		int quantDiv = 0;
		
		for(int x = 2; x <= num; x++) {
			primo = true;
			for(int i = 1; i <= x; i++) {
				if(i != 1 && i != x) {
					if(x % i == 0) {
						primo = false;
						i = x + 1;
					}
				}
				quantDiv++;
			}
			if(primo)
				System.out.println(x + " � primo");
		}
		System.out.print("\nQuantidade de divis�es realizadas: " + quantDiv);
		
		entrada.close();
	}
}