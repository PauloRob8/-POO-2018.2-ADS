package modelo;

public class ContaPoupanša extends ContaBancaria {
	
	public final double taxa = 0.65;
	public double rendimento;

	public ContaPoupanša(String t, int s, int numero) {
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
