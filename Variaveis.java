import java.math.BigDecimal;

public class Variaveis {

	/**
	 * São tipos primitivos int, double, float, boolean, char, long,byte, short
	 * String não é primitivo (referência)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int idade = 33;
		int idadeMinima = 18;

		if (idade < idadeMinima) {
			System.out.println(String.format("Você não tem idade mínima. Sua idade é %s", idade));
		} else {
			System.out.println("Você tem acesso!");
		}

		double salario = 19.00;

		String nomeCompleto = "Marcelo Melo";
		nomeCompleto.length();

		BigDecimal bd = new BigDecimal(100);

	}

}
