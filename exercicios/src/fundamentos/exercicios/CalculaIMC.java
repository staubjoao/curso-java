package fundamentos.exercicios;

import java.util.Scanner;

public class CalculaIMC {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite seu peso: ");
		double peso = sc.nextDouble();
		System.out.print("Digite a sua altura: " + peso);
		double altura = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.println("Seu IMC é " + imc);
	}

}
