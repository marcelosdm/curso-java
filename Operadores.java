
public class Operadores {

	public static void main(String[] args) {

//		Operadores de atribuição: =, +=, -=, *=, /=, %=
		
		int idade = 18;
		idade += 1;
		idade -= 1;
		idade *= 1;
		idade /= 1;
		idade %= 1;
		
		System.out.println(idade);
		
//		Operadores de comparação >=, <=, >, <, ==, !=
		
		boolean comparaValores = 2 == 1;
		
		System.out.println("Dois é igual a um? " + comparaValores);
		
//		Operadores lógicos: &&, ||
		int pessoas = 18;
		int lugares = 20;
		
		System.out.println(pessoas <= 20 && lugares >= 20);
		System.out.println(pessoas <= 20 || lugares > 100);
		
		
		
	}

}
