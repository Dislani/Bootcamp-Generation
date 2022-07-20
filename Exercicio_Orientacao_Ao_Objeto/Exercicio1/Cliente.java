package Exercicio_Orientacao_Ao_Objeto;

public class Cliente

{
	
	/*1- Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
		
		//caracteristicas -> atributos
		protected int idade;
		protected String pagamento;
		protected String nome;
		
		
		//Criação do metodo especial construtor
		public Cliente (String nome, int idade, String pagamento) {
			
		}
		/* precisa estra publica para que outra class OBJETO consiga acessar*/

		
		
		public String getNome(String nome) 
		{
			this.nome = nome;
			System.out.println("\nNome do cliente: Amanda Silva");
			return nome;
		}
	

		public void getIdade(int idade) {
			this.idade = idade;
			System.out.println("\nIdade do cliente: " +35+ " anos de idade");
			
		}

		public String getPagamento(String pagamento) {
			this.pagamento = pagamento;
			System.out.println("\n Situacao atual das parcelas:\n 2 PARCELAS ATRASADAS");
			return pagamento;
		}

		
		
		

		public String getNome2(String nome) {
			this.nome = nome;
			System.out.println("\nNome do cliente: Luis Carlos");
			return nome;
		}

		
		public int getIdade2(int idade) {
			
			this.idade = idade;
			System.out.println("\nIdade do cliente: " +46+ " anos de idade");
			return idade;
		}
		
		
		public String getPagamento2(String pagamento) {
			
			this.pagamento = pagamento;
			System.out.println("\n Situacao atual das parcelas:\n SEM PARCELAS ATRASADAS");
			return pagamento;
		}

	
	}
		

 
	
	