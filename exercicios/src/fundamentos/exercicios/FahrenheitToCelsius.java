package fundamentos.exercicios;

import java.util.Scanner;

public class FahrenheitToCelsius {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a temperatura em °C: ");
		double c = sc.nextDouble();

		double f = (c * 9 / 5) + 32;
		System.out.println("O valor em F é " + f);
	}
}
