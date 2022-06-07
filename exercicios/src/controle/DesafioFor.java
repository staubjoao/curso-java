package controle;

public class DesafioFor {

	public static void main(String[] args) {

		String valor = "#";

		boolean b = true;
		for (; b;) {
			System.out.println(valor);
			valor += "#";
			b = valor.length() <= 5 ? true : false;
		}
		
		System.out.println();
		// solução do curso
		for (String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}
