package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana");
		String dia = sc.next();
		
		int i = 0;
		if(dia.equalsIgnoreCase("domingo")) {
			i = 1;
		}else if(dia.equalsIgnoreCase("segunda")) {
			i = 2;
		}else if(dia.equalsIgnoreCase("terça")) {
			i = 3;
		}else if(dia.equalsIgnoreCase("quarta")) {
			i = 4;
		}else if(dia.equalsIgnoreCase("quinta")) {
			i = 5;
		}else if(dia.equalsIgnoreCase("sexta")) {
			i = 6;
		}else if(dia.equalsIgnoreCase("sábado")) {
			i = 7;
		}else {
			System.out.println("Dia invalido");
		}
		
		if(i != 0)
			System.out.println(i);
		sc.close();
	}
}
