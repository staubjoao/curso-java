package controle.exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int maior = entrada.nextInt();
		int num;
		for (int i = 0; i < 9; i++) {
			num = entrada.nextInt();
			if (num > maior)
				maior = num;
		}

		System.out.println("Maior: " + maior);

		entrada.close();
	}
}
