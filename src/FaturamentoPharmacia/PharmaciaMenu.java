package FaturamentoPharmacia;

import java.util.Scanner;

public class PharmaciaMenu {
	Scanner opcao = new Scanner (System.in);
	PharmaciaRelatorioDeVendas prv = new PharmaciaRelatorioDeVendas();
	PharmaciaProdutos pp = new PharmaciaProdutos();
	PharmaciaVendedores pv = new PharmaciaVendedores();
	PharmaciaFornecedores pf = new PharmaciaFornecedores();
	PharmaciaOperador po = new PharmaciaOperador();
	private int resposta;
	void MenuPrincipal () {
		System.out.println("###############  MENU ################");
		System.out.println("1 - Operador");
		System.out.println("2 - Vendedores");
		System.out.println("3 - Relatórios de Vendas");
		System.out.println("4 - Fornecedores");
		System.out.println("5 - Produtos");
		System.out.println("6 - Sair do sistema");
		System.out.println("######################################");
		System.out.println("Informe a opção desejada");
		resposta = opcao.nextInt();
		
		if (resposta ==1) {
			po.imprimirExtrato();
			MenuPrincipal();
		}
		
		
		else if (resposta ==2) {
			pv.imprimirExtrato();
			MenuPrincipal();
		}
		
		
		else if (resposta ==3) {
			prv.imprimirExtrato();
			MenuPrincipal();
		}
		
		else if (resposta == 4) {
			pf.imprimirExtrato();
			MenuPrincipal();
			
		}
		
		
		else if (resposta == 5) {
			pp.imprimirExtrato();
			MenuPrincipal();
			
		}
		
		
		else if (resposta == 6) {
			System.out.println("Até logo!");
		}
	}
}
