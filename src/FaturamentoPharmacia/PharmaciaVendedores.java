package FaturamentoPharmacia;

import java.util.Scanner;

public class PharmaciaVendedores extends Pharmacia {
	
	@Override
	public void imprimirExtrato() {
Scanner loja = new Scanner(System.in);
		
		String NOME;
		double SALARIO = 1000;
		double VENDAS, ADICIONAL, TOTAL;
		
		System.out.println("Qual é seu nome?");
		NOME = loja.nextLine();
		System.out.println("Qual seu quantitativo de vendas?");
		VENDAS = loja.nextDouble();
		
		ADICIONAL = VENDAS * 0.25;
		TOTAL = SALARIO + ADICIONAL;
		System.out.print(NOME);
		System.out.printf(" seu salário é %.2f" , TOTAL);
		System.out.println();
		
		
		
		
		
	}

}
