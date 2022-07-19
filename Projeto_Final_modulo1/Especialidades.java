package projetoFinalBloco1;

public abstract class Especialidades implements UBS {
	
	//ATRIBUTOS DA CLASSE
	
	protected String cartSus;
	protected int idade;
	protected String endereco;
	protected String cpf;
	protected double altura;
	protected double peso;
	protected Boolean has;
	protected Boolean dm;
	protected String nome;

	
	// MÉTODO CONSTRUTOR
	public Especialidades (String nomeProfissional, String especialidade)
	{
		System.out.println("\nProfissional: "+nomeProfissional+" - "+especialidade);
	}
	
	
	// MÉTODOS ABSTRATOS
	abstract public void cadastrar();
	abstract public void marcarConsulta();
	abstract public void visitar();
	abstract public void encaminhar();
	abstract public void medicar();

	
	//MÉTODOS HERDADOS DA INTERFACE
	
	@Override
	public void cartaoVac(boolean CartaoVac) {
				
	}
	
	@Override
	public void temperatura(double testeTemperatura) {
		
	}

	@Override
	public void avisoTemperatura() {
		
		
	}
	
}
	



