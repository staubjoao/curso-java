package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String entrada = "";
		while (!entrada.equalsIgnoreCase("sair")) {
			System.out.print("Digite sua mensagem: ");
			entrada = sc.next();
			if(!entrada.equalsIgnoreCase("sair"))
				System.out.println(entrada);
		} 
		
		sc.close();
	}
}
