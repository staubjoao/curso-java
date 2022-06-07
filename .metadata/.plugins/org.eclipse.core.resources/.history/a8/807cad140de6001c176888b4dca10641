package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %
		// realizar a operação

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número 1: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("Digite o número 1: ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("Digite a operação: ");
		String op = sc.next();

		int resultado = 0;
		resultado = op.equals("+") ? num1 + num2 : 0;
		resultado = op.equals("-") ? num1 - num2 : resultado;
		resultado = op.equals("*") ? num1 * num2 : resultado;
		resultado = op.equals("/") ? num1 / num2 : resultado;
		resultado = op.equals("%") ? num1 % num2 : resultado;
		
		System.out.println("O resultado é " + resultado);
	}
}
