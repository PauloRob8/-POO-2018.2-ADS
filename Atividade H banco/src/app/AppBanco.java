package app;

import negocios.Banco;

import javax.swing.JOptionPane;


public class AppBanco {
	
	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		int option1 = Integer.parseInt(JOptionPane.showInputDialog(banco.menu()));
		while(option1 != 0) {
			switch(option1){
			
				case 1:
					int option2 = Integer.parseInt(JOptionPane.showInputDialog("Selecione tipo de conta:\n1->Conta Poupança\n2-> Conta Corrente\n"
							+ "3->Conta Digital\n4->Conta Investimento\n5-> Conta Capitalização"));
					switch(option2) {
					case 1:
						String nome = JOptionPane.showInputDialog("Digite seu nome: ");
						int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha: "));
						int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite número: "));
						banco.nova_contaPoupança(nome, senha, numConta);
						JOptionPane.showMessageDialog(null, "Conta Criada com sucesso!");
						option1 = Integer.parseInt(JOptionPane.showInputDialog(banco.menu()));
						break;
						
					case 2:
						String nome1 = JOptionPane.showInputDialog("Digite seu nome: ");
						int senha1 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha: "));
						int numConta1 = Integer.parseInt(JOptionPane.showInputDialog("Digite número: "));
						int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite da conta: "));
						banco.nova_contaCorrente(nome1, senha1, numConta1,limite);
						JOptionPane.showMessageDialog(null, "Conta Criada com sucesso!");
						option1 = Integer.parseInt(JOptionPane.showInputDialog(banco.menu()));
						break;
						
					case 3:
						String nome2 = JOptionPane.showInputDialog("Digite seu nome: ");
						int senha2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha: "));
						int numConta2 = Integer.parseInt(JOptionPane.showInputDialog("Digite número: "));
						int limite2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite da conta: "));
						banco.nova_contaDigital(nome2, senha2, numConta2,limite2);
						JOptionPane.showMessageDialog(null, "Conta Criada com sucesso!");
						option1 = Integer.parseInt(JOptionPane.showInputDialog(banco.menu()));
						break;
						
					case 4:
						String nome3 = JOptionPane.showInputDialog("Digite seu nome: ");
						int senha3 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha: "));
						int numConta3 = Integer.parseInt(JOptionPane.showInputDialog("Digite número: "));
						int prazo = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias do investimento (O prazo até o dia do saque) "));
						banco.nova_contaInvenstimento(nome3,senha3,numConta3,prazo);
						JOptionPane.showMessageDialog(null, "Conta Criada com sucesso!");
						option1 = Integer.parseInt(JOptionPane.showInputDialog(banco.menu()));
						break;
						
					case 5:
						String nome4 = JOptionPane.showInputDialog("Digite seu nome: ");
						int senha4 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha: "));
						int numConta4 = Integer.parseInt(JOptionPane.showInputDialog("Digite número: "));
						int prazo1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias do investimento (O prazo até o dia do saque) "));
						banco.nova_contaCapitalizacao(nome4, senha4, numConta4,prazo1);
						JOptionPane.showMessageDialog(null, "Conta Criada com sucesso!");
						option1 = Integer.parseInt(JOptionPane.showInputDialog(banco.menu()));
						break;
						
						}
					break;
				
				case 2:
					int conta = Integer.parseInt(JOptionPane.showInputDialog("Digite número da conta: "));
					for(int i = 0;i < banco.contContasP; i++) {
						if(conta == banco.contas[i].numeroConta) {
							double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor a ser depositado: "));
							banco.depositarPoupança(valor, banco.contas[i]);
							JOptionPane.showMessageDialog(null, "R$" +valor+" depositado com sucesso");
						}
				}
					option1 = Integer.parseInt(JOptionPane.showInputDialog(banco.menu()));
					break;
					
				case 3:
					int conta1 = Integer.parseInt(JOptionPane.showInputDialog("Digite número da conta: "));
					for(int i = 0;i < banco.contContasCC; i++) {
						if(conta1 == banco.contasCC[i].numeroConta) {
							double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor a ser depositado: "));
							banco.depositarCorrente(valor, banco.contasCC[i]);
							JOptionPane.showMessageDialog(null, "R$" +valor+" depositado com sucesso");
						}
				}
					option1 = Integer.parseInt(JOptionPane.showInputDialog(banco.menu()));
					break;
					
				case 4:
					int conta2 = Integer.parseInt(JOptionPane.showInputDialog("Digite número da conta: "));
					for(int i = 0;i < banco.contContasI; i++) {
						if(conta2 == banco.contasI[i].numero) {
							double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor a ser depositado: "));
							banco.depositarInvestimento(valor, banco.contasI[i]);
							JOptionPane.showMessageDialog(null, "R$" +valor+" depositado com sucesso");
						}
				}
					option1 = Integer.parseInt(JOptionPane.showInputDialog(banco.menu()));
					break;
				case 5:
					int conta3 = Integer.parseInt(JOptionPane.showInputDialog("Digite número da conta: "));
					for(int i = 0;i < banco.contContasC; i++) {
						if(conta3 == banco.contasC[i].numero) {
							banco.depositarCapitalizacao(banco.contasC[i]);
							JOptionPane.showMessageDialog(null, "R$ 500 depositado com sucesso");
						}
				}
					option1 = Integer.parseInt(JOptionPane.showInputDialog(banco.menu()));
					break;
					
			}
			
		}
		
	}

}
