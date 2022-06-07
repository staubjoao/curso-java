package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double total = 0;
		int qtd = 0;
		double nota = 0;
		while (nota != -1) {
			System.out.print("Digite a nota: ");
			nota = Double.parseDouble(entrada.nextLine());
			if (nota >= 0 && nota <= 10) {
				qtd++;
				total += nota;
			}else if(nota != -1) {
				System.out.println("Nota invalida");
			}
		}

		System.out.println("Total: " + total);
		System.out.println("Média: " + total / qtd);

		entrada.close();
	}
}
