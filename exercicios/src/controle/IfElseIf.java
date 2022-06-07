package controle;

import javax.swing.JOptionPane;

public class IfElseIf {

	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("Informe o número");

		double nota = Double.parseDouble(entrada);

		if (nota > 10 || nota < 0) {
			System.out.println("Nota invalida");
		} else if (nota >= 8.1) {
			System.out.println("Conceito A");
		} else if (nota >= 6.5) {
			System.out.println("Conceito B");
		} else if (nota >= 5.5) {
			System.out.println("Conceito C");
		} else {
			System.out.println("Conceito D");
		}

	}
}
