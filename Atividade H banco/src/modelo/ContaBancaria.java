package modelo;

public class ContaBancaria {
	
	public int numeroConta;
	public String titular;
	public int senha;
	public int agencia;
	public double saldo;
	
	
	public ContaBancaria(String t,int s,int numero) {
		this.titular = t;
		this.senha = s;
		this.numeroConta = numero;
		
	}
	
	
	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		}
	}
	
	public void sacar(int valor) {
		this.saldo -= valor;
	}
	
	public void transferir(ContaBancaria conta,double valor) {
		this.saldo -= valor;
		conta.saldo += valor;
		
	}

}
