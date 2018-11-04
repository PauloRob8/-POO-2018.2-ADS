package modelo;

public class ContaPoupança extends ContaBancaria {
	
	public final double taxa = 0.65;
	public double rendimento;

	public ContaPoupança(String t, int s, int numero) {
		super(t, s, numero);
	}

	public void render(){
		super.depositar(this.saldo * this.taxa);
	}
	
	public double getRendimento() {
		this.rendimento = saldo * taxa;
		return rendimento;
	}
	
}
