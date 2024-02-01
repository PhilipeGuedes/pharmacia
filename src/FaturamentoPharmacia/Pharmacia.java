package FaturamentoPharmacia;

public abstract class Pharmacia {
	// Os Atributos
	private double saldoVA = 2000;
	private double saldoVB = 3000;
	private double saldoRV = saldoVA + saldoVB;
	
	// Os metodos de Get e Set

	public double getSaldoVA() {
		return saldoVA;
	}

	public void setSaldoVA(double saldoVA) {
		this.saldoVA = saldoVA;
	}

	public double getSaldoVB() {
		return saldoVB;
	}

	public void setSaldoVB(double saldoVB) {
		this.saldoVB = saldoVB;
	}

	public double getSaldoRV() {
		return saldoRV;
	}

	public void setSaldoRV(double saldoRV) {
		this.saldoRV = saldoRV;
	}
	
	// Metodo Abstrato
	public abstract void imprimirExtrato();


}
