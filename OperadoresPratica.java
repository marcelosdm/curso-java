import java.math.BigDecimal;

public class OperadoresPratica {
	public static void main(String[] args) {
		
//		BigDecimal saldo = new BigDecimal(20000);
		double saldo = 20000.00;
		
		int diaRendimento = 6;
		double percentualRendimento = 0.05;
		
		System.out.println("Saldo atual: " + saldo);
		
//		if(saldo.intValue() > 0 && diaRendimento == 6) {
//			saldo.multiply(multiplicand) 
//		}
		
		if(saldo > 0 && diaRendimento == 6) {
			saldo = saldo + (saldo *= percentualRendimento);
		}
		
		System.out.println("Saldo pós rendimento: " + saldo);
	}
}
