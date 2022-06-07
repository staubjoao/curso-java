package controle.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double nota1 = Double.parseDouble(entrada.nextLine());
		double nota2 = Double.parseDouble(entrada.nextLine());
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7.0) {
			System.out.println("Aprovado");
		}else if(media < 7.0 && media > 4.0) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}

		entrada.close();
	}
}
