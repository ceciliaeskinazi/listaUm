package quartaFeira;

public class ContaCorrente {
	private int numDaConta;
	private double saldo;
	
	public ContaCorrente(int novoNumDaConta , double novoSaldo) {
		this.numDaConta = novoNumDaConta;
		this.saldo = novoSaldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
		
	}
	
	public double depositar(double a) {
		return saldo = a + saldo;
	}
	
	public double sacar(double b) {
		return saldo = saldo - b;
	}
	
	public String toString() {
		return "Conta: " + this.numDaConta + "\nSaldo: R$: " + this.saldo;
	}

}
