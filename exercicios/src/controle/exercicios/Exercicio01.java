package controle.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n = entrada.nextInt();

		if ((n > 0 && n < 10) && n % 2 == 0) 
			System.out.println("Está entre 0 e 10 e é par");

		entrada.close();
	}
}
