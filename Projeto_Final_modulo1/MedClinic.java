package projetoFinalBloco1;

import java.util.Scanner;

public class MedClinic extends Especialidades  {
	
		Scanner leia = new Scanner(System.in);
		int op;
	
		//MÉTODO HERDADO - CONSTRUTOR
		
		public MedClinic(String nomeProfissional, String especialidade)
		{
			super(nomeProfissional, especialidade);
		}
		
		
		//MÉTODO DA CLASSE
		
		void procedimentos ()
		{
			System.out.println("Agora escolha o procedimento que se adeque a sua necessidade: ");
			System.out.println("\n1. Realizar nova consulta.");
			System.out.println("\n2. Marcar retorno.");
			System.out.println("\n3. Solicitar visita domiciliar.");
			op = leia.nextInt();
					
		switch(op)
		{
		case 1:
			System.out.println("\nAgendar consulta.");
			break;
		case 2:
			System.out.println("\nAgendar volta.");
			break;
		case 3:
			System.out.println("\nAgendar visita/atendimento domiciliar.");
			break;
		default: System.out.println("\n Opção inválida! Tente novamente.");	
		}
		
		if(op==1)
		{
			int x;
			System.out.println("A consulta com o médico(a) clínico(a) ocorre nos dias: ");
			System.out.println("\n1. Dia: Terça-feira / Horário: 8h às 12h");
			System.out.println("\n2. Dia: Terça-feira / Horário: 14h às 17h");
			System.out.println("\n3. Dia: Quinta-feira / Horário: 8h às 12h");
			System.out.println("\n4. Dia: Quinta-feira / Horário: 14h às 17h");
			System.out.println("\n Digite a opção correspondente ao melhor dia para sua consulta: ");
			x = leia.nextInt();
			System.out.println("\nSua consulta está agendada! ");
		}
		
		if(op==2)
		{
			int x;
			System.out.println("A consulta de retorno com o médico(a) clínico(a) ocorre nos dias: ");
			System.out.println("\n1. Dia: Segunda-feira / Horário: 8h às 12h");
			System.out.println("\n2. Dia: Segunda-feira / Horário: 14h às 17h");
			System.out.println("\n3. Dia: Sexta-feira / Horário: 8h às 12h");
			System.out.println("\n4. Dia: Sexta-feira / Horário: 14h às 17h");
			System.out.println("\n Digite a opção correspondente ao melhor dia para sua consulta: ");
			x = leia.nextInt();
			System.out.println("\nSeu retorno está agendado!");
	
		}
		
		if(op==3)
		{
			int x;
			System.out.println("A visita domiciliar do(a) médico(a) clínico(a) ocorre: ");
			System.out.println("\n1. Dia: Quarta-feira / Horário: 8h às 12h");
			System.out.println("\n2. Dia: Quarta-feira / Horário: 14h às 17h");
			System.out.println("\n Digite a opção correspondente ao melhor dia para sua consulta: ");
			x = leia.nextInt();
			System.out.println("\nSeu consulta domiciliar está agendada!");
		}
	}
		
		//MÉTODOS HERDADOS DA INTERFACE
		
		@Override
		public void avisoTemperatura() {
				System.out.println("\n ***ATENÇÃO***");
				System.out.println("\n Acesso a UBS permitido apenas mediante aferição de temperatura.");
				System.out.println("Individuos com temperatura acima de 37,5ºC não terão sua entrada permitida na UBS.");
			}
		
	    @Override
		public void cartaoVac(boolean CartaoVac) {
	    		System.out.println("\n ***ATENÇÃO***");
	    	  	System.out.println("\n Máscara dispensada apenas mediante apresentação do cartão de vacinação para Covid-19.");
	    }
		
	    //MÉTODOS HERDADOS DA SUPERCLASSE
	    
		@Override
		public void cadastrar()
		{
		
		}
		
		@Override
		public void marcarConsulta()
		{
			
		}
		
		@Override
		public void visitar() 
		{
					
		}

		@Override
		public void encaminhar() 
		{
					
		}

		@Override
		public void medicar() 
		{
					
		}
		
	}


