package contas;

public class ContaInvestimento extends Conta {
    private double juros;
    public ContaInvestimento() {
        System.out.println("vazia");
    }
    public ContaInvestimento(int numero, double saldo, double juros) {
        super(numero, saldo);
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public boolean sacar(double valor) {
        if(getSaldo() >= valor) {
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if(valor >= 0) {
            double novoSaldo = getSaldo() + valor;
            setSaldo(novoSaldo);
            return true;
        } else {
            return false;
        }
    }

    public void juros(double juros){
        double novoSaldo=getSaldo() + ((juros*getSaldo())/100);
    }

}
