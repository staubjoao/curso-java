package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro salario: ");
		String sal1 = sc.nextLine();
		System.out.print("Digite o segundo salario: ");
		String sal2 = sc.nextLine();
		System.out.print("Digite o terceiro salario: ");
		String sal3 = sc.nextLine();

		double s1 = Double.parseDouble(sal1.replace(',', '.'));
		double s2 = Double.parseDouble(sal2.replace(',', '.'));
		double s3 = Double.parseDouble(sal3.replace(',', '.'));

		double soma = s1 + s2 + s3;
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + soma / 3);
	}
}
