package contas;

public class ContaEspecial extends Conta{
	public double limite;

	public ContaEspecial(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean sacar(double valor) {
		if(getSaldo() >= valor) {
			double novoSaldo = getSaldo() - (valor * 0.99);
			setSaldo(novoSaldo);
			return true;
		} else {
			return false;
		}
	}

}