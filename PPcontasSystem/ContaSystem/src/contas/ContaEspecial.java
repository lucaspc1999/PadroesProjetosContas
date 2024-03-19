package contas;

public class ContaEspecial extends Conta{
	public double limite;

	public ContaEspecial(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}

	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - (valor * 0.99);
			return true;
		} else {
			return false;
		}
	}

}