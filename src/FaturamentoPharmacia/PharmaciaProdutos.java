package FaturamentoPharmacia;

import java.util.Scanner;

public class PharmaciaProdutos extends Pharmacia {
	
	@Override
	public void imprimirExtrato() {
		// operações matemáticas 
        Scanner venda = new Scanner(System.in);
        Scanner validade = new Scanner(System.in);
		int A;
        
        double p1, q1, p2, q2, ICMS, resultado1, resultado2, resultado3;
        
        System.out.println("Informe o valor de venda do primeiro produto");
        p1 = venda.nextDouble();
        System.out.println("Informe o quantitativo vendido do primeiro produto");
        q1 = venda.nextDouble();
        System.out.println("Informe o valor de venda do segundo produto");
        p2 = venda.nextDouble();
        System.out.println("Informe o quantitativo vendido do segundo produto");
        q2 = venda.nextDouble();
        System.out.println("Informe o percentual de ICMS sem o sinal da sua região");
        ICMS = venda.nextDouble();
        
        resultado1 = (p1*q1)+(p2*q2);
        resultado2 = (ICMS/100)+1;
        resultado3 = resultado1 * resultado2;
  
        System.out.printf("O valor total com ICMS na venda dos produtos foi de R$ %.2f" , resultado3);
		System.out.println();
		
		System.out.println("Informe o ano atual para obter seu ano de fabricação e validade do produto");
		A = validade.nextInt();
		
		// incremento e decremento de variáveis
		System.out.println(" o ano de fabricação é: " + --A + " e ano de validade é: " + (++A + 1) );
		System.out.println();
	}
	
	
}
