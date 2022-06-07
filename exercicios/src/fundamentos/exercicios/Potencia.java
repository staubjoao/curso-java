package fundamentos.exercicios;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int num = sc.nextInt();

		System.out.println("quadrado: " + num * num);
		System.out.println("cubo: " + num * num * num);
	}
}
