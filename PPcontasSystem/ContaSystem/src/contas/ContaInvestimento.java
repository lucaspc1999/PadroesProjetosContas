package contas;

public class ContaInvestimento extends Conta {
    public double juros;
    public ContaInvestimento() {
        System.out.println("vazia");
    }
    public ContaInvestimento(int numero, double saldo, double juros) {
        super(numero, saldo);
        this.juros = juros;
    }
    public boolean sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if(valor >= 0) {
            this.saldo = this.saldo + valor;
            return true;
        } else {
            return false;
        }
    }

    public void juros(double juros){
        this.saldo=this.saldo + ((juros*this.saldo)/100);
    }

}
