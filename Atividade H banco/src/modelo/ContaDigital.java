package modelo;

public class ContaDigital {
	
	public int titular;
	public int senha;
	public int numero;
	public double saldo;
	public int limite;
	public ContaCorrente contaC;
	
	public ContaDigital(String t,int s,int n,int l) {
		 this.contaC = new ContaCorrente(t,s,n,l);
	}
	
	public void depositar(double valor) {
		contaC.depositar(valor);
	}
	
	public void transferir(ContaBancaria conta,double valor) {
		this.saldo -= valor;
		conta.saldo += valor;
	}
}
