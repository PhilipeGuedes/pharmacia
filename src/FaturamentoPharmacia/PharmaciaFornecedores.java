package FaturamentoPharmacia;

import java.util.Scanner;

public class PharmaciaFornecedores extends Pharmacia {
	// utilização do FOR para repetição 
	@Override
	public void imprimirExtrato() {  {
		Scanner pergunta = new Scanner(System.in);
		double n = 0, j =0, m;
		
		System.out.println("Escreva na sequência o total de produtos vendidos dos 5 fornecedores");
		for (int f=0; f <=4; f++) {
			System.out.println("Escreva total de produtos");
			n = pergunta.nextDouble();
			j = j + n;
		
	}
		m = j /5;
		
		System.out.println("A média dos produtos é " + m);
		System.out.println("A soma dos produtos é " + j);
		
	}
	
    }
	
	
	}
