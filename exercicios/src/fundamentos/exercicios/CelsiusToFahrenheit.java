package fundamentos.exercicios;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a temperatura em F: ");
		double f = sc.nextDouble();

		double c = ((f - 32) * 5) / 9;
		System.out.println("O valor em °C é " + c);
	}
}
