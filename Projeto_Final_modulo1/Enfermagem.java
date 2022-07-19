package projetoFinalBloco1;

import java.util.Scanner;

public class Enfermagem extends Especialidades
{
	int op;
		
	//MÉTODO HERDADO DA SUPERCLASSE - CONSTRUTOR
	
	public Enfermagem(String nomeProfissional, String especialidade)
	{
		super(nomeProfissional, especialidade);
	}
	
	//MÉTODO DA CLASSE
	
	void procedimentos()
	{
		System.out.println("Agora escolha o procedimento que se adequa a sua necessidade de atendimento:");
		System.out.println("1. Vacinação.");
		System.out.println("2. Exames laboratoriais.");
		System.out.println("3. Exames ginecológicos.");
		Scanner leia = new Scanner(System.in);
		op = leia.nextInt();
		
		switch(op)
		{
		case 1: 
			System.out.println("\n Agendar vacinação");
			break;
		case 2: 
			System.out.println("\n Agendar exames laboratoriais");
			break;
		case 3: 
			System.out.println("\n Agendar exames ginecológicos");
			break;
		default: System.out.println("\n Opção inválida! Tente novamente.");	
		}
		
		if (op==1)
		{ 
			String x;
			System.out.println("1. A vacinação para Covid-19 ocorre toda quarta-feira.");
			System.out.println("2. A vacinação para outras patologias ocorre toda sexta-feira.");
			System.out.println("\n Digite o dia da sua vacinação: ");
			x = leia.next();
			System.out.println("\nSua vacina está agendada para próxima "+x);
		}
		else if (op==2)
		{ 
			String x;
			System.out.println("A coleta de exames laboratoriais acontece no turno da manhã nos seguintes dias: segunda-feira e quinta-feira. ");
			System.out.println("\n Digite o dia que você deseja realizar o exame: ");
			x = leia.next();
			System.out.println("\nSeu exame está agendado para a próxima "+x);
		}
		if (op==3)
		{ 
			String x;
			System.out.println("Os exames ginecológicos acontecem nos seguintes dias: terça-feira e sexta-feira. ");
			System.out.println("\n Digite o dia que você deseja realizar o exame: ");
			x = leia.next();
			System.out.println("\nSeu exame está agendado para a próxima "+x);
		}
	}
	
	
	//MÉTODO HERDADO DA INTERFACE (Todos são sobrescritos)
	@Override
	public void cartaoVac(boolean CartaoVac) {
			System.out.println("\n ***ATENÇÃO***");    // Este é um método sobrecarregado
    	  	System.out.println("\n Máscara dispensada apenas mediante apresentação do cartão de vacinação para Covid-19.");
    }
	
	@Override
	public void avisoTemperatura() {
			System.out.println("\n ***ATENÇÃO***");
			System.out.println("\n Acesso a UBS permitido apenas mediante aferição de temperatura.");
			System.out.println("Individuos com temperatura acima de 37,5ºC não terão sua entrada permitida na UBS.");
		}
	        	    	    	
	@Override
	public void cadastrar() {
			
	}

	@Override
	public void marcarConsulta() {
				
	}

	@Override
	public void visitar() {
				
	}

	@Override
	public void encaminhar() {
				
	}

	@Override
	public void medicar() {
				
	}
	
}


