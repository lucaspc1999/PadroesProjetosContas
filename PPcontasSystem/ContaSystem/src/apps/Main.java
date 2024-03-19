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

		conta1.numero = 1;
//		conta1.saldo = 10000;
		conta1.depositar(10000);
		conta2.numero = 2;
		conta2.saldo = 20000;

		System.out.println("Número da conta 1: " + conta1.numero);
		System.out.println("Número do saldo 1: " + conta1.saldo);
		System.out.println("Número da conta 2: " + conta2.numero);
		System.out.println("Número do saldo 2: " + conta2.saldo);
		System.out.println("Número da conta especial 1: " + contaesp1.numero);
		System.out.println("Número do saldo especial 1: " + contaesp1.saldo);
		System.out.println("Número do limite especial 1: " + contaesp1.limite);
		System.out.println("Número da conta investimento 1: " + containv1.numero);
		System.out.println("Número do juros investiento 1 1: " + containv1.juros);
		containv1.juros(containv1.juros);
		System.out.println("Número do saldo investimento 1: " + containv1.saldo);
		containv1.juros(35);
		System.out.println("Número do saldo investimento 1: " + containv1.saldo);





	}

}
