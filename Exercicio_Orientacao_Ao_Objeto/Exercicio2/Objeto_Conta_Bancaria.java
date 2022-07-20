package Exercicio_Orientacao_Ao_Objeto;

public class Objeto_Conta_Bancaria extends Conta_Bancaria {

	
	//Metodo herdado da class Conta_Bancaria
	public Objeto_Conta_Bancaria(String nome, String senhaCliente, double saldo) {
		super(nome, senhaCliente, saldo);
		
	}

	public static void main(String[] args) {
		
	
		
		Conta_Bancaria Conta= new Conta_Bancaria(null,"", 0);
		Conta.getNomeCliente(null);
		Conta.setSenhaCliente(null);
		Conta.getSaldo(null);
		

	}

}
