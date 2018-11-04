package negocios;

import modelo.*;

public class Banco {
	
	public ContaPoupança contas[] = new ContaPoupança[100];
	public ContaCorrente contasCC[]= new ContaCorrente[100];
	public ContaDigital contasD[] = new ContaDigital[100];
	public ContaInvestimento contasI[] = new ContaInvestimento[100];
	public ContaCapitalizacao contasC[] = new ContaCapitalizacao[100];
	
	public int contContasP = 0;
	public int contContasD = 0;
	public int contContasCC = 0;
	public int contContasI = 0;
	public int contContasC = 0;
	
	public void nova_contaPoupança(String t,int s,int num){
		this.contas[contContasP] = new ContaPoupança(t,s,num);
		this.contContasP ++;
	}
	
	
	public void nova_contaDigital(String t,int s,int num,int limite){
		this.contasD[contContasD] = new ContaDigital(t,s,num,limite);
		this.contContasD ++;
	}
	
	public void nova_contaCorrente(String t,int s,int num,int limite){
		this.contasCC[contContasCC] = new ContaCorrente(t,s,num,limite);
		this.contContasCC ++;
	}
	
	public void nova_contaInvenstimento(String t,int s,int num,int prazo){
		this.contasI[contContasI] = new ContaInvestimento(t,s,num,prazo);
		this.contContasI ++;
	}
	
	public void nova_contaCapitalizacao(String t,int s,int num,int prazo){
		this.contasC[contContasC] = new ContaCapitalizacao(t,s,num,prazo);
		this.contContasC ++;
	}
	
	
	public void depositarPoupança(double valor,ContaPoupança conta) {
		for(int i = 0;i <contContasP;i++) {
			if(this.contas[i]== conta)
				this.contas[i].depositar(valor);
		}
	}
	
	public void depositarCorrente(double valor,ContaCorrente conta) {
		for(int i = 0;i <contContasCC;i++) {
			if(this.contasCC[i]== conta)
				this.contasCC[i].depositar(valor);
		}
	}
	
	public void depositarInvestimento(double valor,ContaInvestimento conta) {
		for(int i = 0;i <contContasI;i++) {
			if(this.contasI[i]== conta)
				this.contasI[i].depositar(valor);
		}
	}
	
	public void depositarCapitalizacao(ContaCapitalizacao conta) {
		for(int i = 0;i <contContasC;i++) {
			if(this.contasC[i]== conta)
				this.contasC[i].depositar();
		}
	}
	
	public String menu() {
		return "1-> Criar Conta\n2-> Deposito via envelope em Poupança\n3-> Deposito via envelope em Corrente\n"
				+ "4-> Deposito via envelope em Investimento\n5-> Deposito via envelope em Capitalização\n0-> Sair";
	}

}
