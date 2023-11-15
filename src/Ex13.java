import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número para calcular seu fatorial: ");
		int num = entrada.nextInt();
		
		/*
		int fat = 1;
		for(int x = 2; x <= num; x++){
			fat = fat * x;
			System.out.println(fat);
		}
		*/
		
		double fat = 1;
		for(int x = num; x >= 2; x--)
			fat = fat * x;
		
		System.out.print("\n" + num + "! = " + fat);
		
		entrada.close();
	}
}