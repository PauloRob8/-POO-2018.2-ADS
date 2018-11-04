package modelo;

public class ContaCorrente extends ContaBancaria {
	
	public int limite;

	public ContaCorrente(String t, int s, int numero,int l) {
		super(t, s, numero);
		this.limite = l;
	}

}
