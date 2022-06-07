package controle.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n = entrada.nextInt();
		boolean primo = true;
		
		for (int i = 2; i < n; i++) {
			if(n % i == 0) {
				System.out.println("Não é primo");
				primo = false;
				break;
			}
		}
		
		if(primo) {
			System.out.println("É primo");
		}

		entrada.close();
	}
}
