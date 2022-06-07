package controle.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {
		case 0:
			System.out.println("O numero " + n + " é um numero primo.");
			break;
		default:
			System.out.println("O numero " + n + "  não é um numero primo.");
		}

		scanner.close();
	}
}
