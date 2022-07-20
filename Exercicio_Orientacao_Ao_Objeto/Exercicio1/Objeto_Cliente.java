package Exercicio_Orientacao_Ao_Objeto;

public class Objeto_Cliente extends Cliente
{
	

	//Metodo herdado do Cliente

	public Objeto_Cliente(String nome, int idade, String pagamento) {
		super(nome, idade, pagamento);
		
		
	}

	public static void main(String[] args) 
	{
		
		//INSTACIANDO UM OBJETO DA CLASSE Cliente
		Cliente Cliente1 = new Cliente(null, 0, null);
		Cliente Cliente2= new Cliente(null, 0, null);
		
		
		Cliente1.getNome(null);
		Cliente1.getIdade(0);
		Cliente1.getPagamento(null);
		
		System.out.println("---------------------------");
		
		
		Cliente2.getNome2(null);
		Cliente2.getIdade2(0);
		Cliente2.getPagamento2(null);
		
		
		
		
		
	}
	
	
	

}
