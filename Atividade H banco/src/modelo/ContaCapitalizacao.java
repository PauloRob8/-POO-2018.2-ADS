package modelo;

public class ContaCapitalizacao extends ContaInvestimento{
	
	
	public ContaCapitalizacao(String t,int s,int numero,int prazo) {
		super(t,s,numero,prazo);
		
	}
	
	public void depositar() {
		super.depositar(500);
	}
	
}
