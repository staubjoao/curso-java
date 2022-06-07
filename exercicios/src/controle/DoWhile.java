package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String txt = "";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.print("Quer sair? ");
			txt = entrada.nextLine();
		} while (!txt.equalsIgnoreCase("por favor"));

		entrada.close();
	}
}
