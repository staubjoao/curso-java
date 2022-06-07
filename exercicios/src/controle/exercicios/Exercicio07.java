package controle.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int soma = 0;
		int num;

		do {
			num = entrada.nextInt();
			if (num > 0)
				soma += num;
		} while (num > 0);

		System.out.println("Soma: " + soma);

		entrada.close();
	}
}
