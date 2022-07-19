package projetoFinalBloco1;

public class ProntuarioEletronico {

	public static void main(String[] args) {
		
		AgenteComunitario cadastro1 = new AgenteComunitario("Marina Rosa", "ACS");
		Enfermagem pct1 = new Enfermagem("Drª Fernanda Andrade", "Enfermeira Chefe");
		MedClinic pct2 = new MedClinic ("Drª Cinthia Santos","Médica Clínica Geral");
			
			
			// CLASSE AGENTE COMUNITÁRIO
			System.out.println("DISTRIBUIÇÃO DE FICHAS PARA REALIZAR CADASTRO");
	 		cadastro1.temperatura(37.0);
			cadastro1.cartaoVac(true);
			cadastro1.distribuirFicha(); 
			System.out.println("\nCADASTRAMENTO");
			cadastro1.cadastrar(); 
			
		
		// CLASSE ENFERMAGEM
			System.out.println("\n");
			pct1.avisoTemperatura();
			pct1.cartaoVac(true);
			System.out.println("\n");
			pct1.procedimentos(); 
			
		
		// CLASSE MedClinic
		
			System.out.println("\n");
			pct2.avisoTemperatura();
			pct2.temperatura(37.0);
			pct2.cartaoVac(true);
			System.out.println("\n");
			pct2.procedimentos();  
		
			
		}

}
