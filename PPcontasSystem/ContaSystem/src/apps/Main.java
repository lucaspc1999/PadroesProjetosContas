package apps;

import contas.Conta;
import contas.ContaEspecial;
import contas.ContaInvestimento;

public class Main {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();

		ContaEspecial contaesp1 = new ContaEspecial(3,1000,10000);
		ContaInvestimento containv1 = new ContaInvestimento(5,2000,30);

		conta1.setNumero(1);
//		conta1.saldo = 10000;
		conta1.depositar(10000);
		conta2.setNumero(2);
		conta2.setSaldo(20000);

		System.out.println("Número da conta 1: " + conta1.getNumero());
		System.out.println("Número do saldo 1: " + conta1.getSaldo());
		System.out.println("Número da conta 2: " + conta2.getNumero());
		System.out.println("Número do saldo 2: " + conta2.getSaldo());
		System.out.println("Número da conta especial 1: " + contaesp1.getNumero());
		System.out.println("Número do saldo especial 1: " + contaesp1.getSaldo());
		System.out.println("Número do limite especial 1: " + contaesp1.getLimite());
		System.out.println("Número da conta investimento 1: " + containv1.getNumero());
		System.out.println("Número do juros investiento 1 1: " + containv1.getJuros());
		containv1.juros(containv1.getJuros());
		System.out.println("Número do saldo investimento 1: " + containv1.getSaldo());
		containv1.juros(35);
		System.out.println("Número do saldo investimento 1: " + containv1.getSaldo());





	}

}
