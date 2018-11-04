package modelo;

public class ContaInvestimento {
	
	public int titular;
	public int senha;
	public int numero;
	public double saldo;
	public int limite;
	public ContaPoupança contaP;
	public int prazo; //quantidade de dias 
	public double investimento;
	public boolean perca;
	
	public ContaInvestimento(String t,int s,int numero,int prazo){
		contaP = new ContaPoupança(t,s,numero);
		
	}
	
	public void render() {
		this.saldo += contaP.getRendimento() * 0.20;
	}
	
	public double investimentoTotal() {
		this.investimento = this.saldo * this.prazo;
		return this.investimento;
	}
	
	public void sacar() {
		if(this.saldo == investimentoTotal()) {
			this.saldo =0;
			this.perca = false;
		}
		
		else
			this.perca = true;
		
	}
	
	public void depositar(double valor) {
		contaP.depositar(valor);
	}

}