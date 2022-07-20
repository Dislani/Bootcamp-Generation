package Exercicio_Orientacao_Ao_Objeto;


public class Conta_Bancaria {

	
	/*6) Crie uma classe conta bancaria e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto conta bancaria, defina
	as instancias deste objeto e apresente as informações deste objeto no
	console.*/
	
	
		//caracteristicas -> atributos
		
		protected String nomeCliente;
		protected String senhaCliente;
		protected double saldo;
		
		//Criação do metodo especial construtor
		
		public Conta_Bancaria (String nome, String senhaCliente, double saldo) {
			
		}



		public String getNomeCliente(String nomeCliente) {
			this.nomeCliente=nomeCliente;
			System.out.println("Nome do Cliente: \nEvellyn Almeida Santos");
			return nomeCliente;
		}


		public void setSenhaCliente(String senhaCliente) {
			this.senhaCliente = senhaCliente;
			System.out.println("\nSenha de acesso ao APP:\n 387683");
			
			
		}
			
			
			public double getSaldo(Object getSaldo) {
				int sal=150;
				System.out.println("\nSaldo em conta Bancaria:" + "R$"+sal+ ",00");
				return saldo;
			
		}

	}


