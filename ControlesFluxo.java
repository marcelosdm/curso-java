
public class ControlesFluxo {

	public static void main(String[] args) {

		double salario = 1000;
		
		if(salario == 1000) {
			System.out.println("Igual a " + 1000);
		} else {
			System.out.println("Diferente de " + 1000);
		}
		
		if(salario == 1000) {
			System.out.println("Igual a " + 1000);
		} else if(salario < 1000) {
			System.out.println("Menor que " + 1000);
		} else {
			System.out.println("Diferente de " + 1000);
		}
		
		
//		Operador ternário
		System.out.println(salario == 1000 ? "Salário é igual a 1000" : "Salário é diferente de 1000");
		
//		Switch: tipos válidos - char, int, byte, short, enum e String
		
		int dia = 8;
		
		switch(dia) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda");
			break;
		default: 
			System.out.println("Dia inválido");
			break;
		}
		
	}

}
