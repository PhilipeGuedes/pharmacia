package FaturamentoPharmacia;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PharmaciaRelatorioDeVendas extends Pharmacia {
	
	@Override
	public void imprimirExtrato() {
		System.out.println("### Relatório de vendas###");
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();
		
		System.out.printf("Saldo total de vendas é de; R$ %.2f\n" , this.getSaldoRV());
		System.out.println("Data é; " + sdf.format(date));
	
	}

}
