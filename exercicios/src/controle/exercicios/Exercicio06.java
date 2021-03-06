package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Random numeroAleatorio = new Random();
		int numSorteado = numeroAleatorio.nextInt(101);
		int tentativas = 1;
		int num;
		
		System.out.println("Começou!");
		do {
			System.out.print("Digite um número: ");
			num = entrada.nextInt();
			if(num > numSorteado) {
				System.out.printf("Número sorteado é menor doque o número digitado!\nVocê ainda tem %d tentativas\n", 10 - tentativas);
			}else if(num < numSorteado) {
				System.out.printf("Número sorteado é maior doque o número digitado!\nVocê ainda tem %d tentativas\n", 10- tentativas);
			}else {
				System.out.println("Parabéns você acertou em "+ tentativas+" tentativas o número era o "+ numSorteado);				
			}
			tentativas++;
		} while (num != numSorteado && tentativas <= 10);

		entrada.close();
	}
}
