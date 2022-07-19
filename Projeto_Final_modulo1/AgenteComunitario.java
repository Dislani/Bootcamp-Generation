package projetoFinalBloco1;

import java.util.*;

public class AgenteComunitario extends Especialidades {
	
	
	// ATRIBUTOS
	
	protected String[] fichas = new String[5];
	protected String ficha;
	protected int prontuario;
	protected String verifica;
	Scanner scan = new Scanner(System.in);
	
	//MÉTODO HERDADO - CONSTRUTOR
	
	public AgenteComunitario(String nomeProfissional, String especialidade)
	{
		super(nomeProfissional, especialidade);
	}
	
	//MÉTODOS DA CLASSE
	/* Por dia tem apenas 20 fichas, cada vez que o método for chamado irá contabilizar um paciente*/
	
	void distribuirFicha() {
		for (int i = 0; i < fichas.length; i++) {
			System.out.println("Digite o nome do paciente que receberá a ficha: ");
			ficha = scan.nextLine();
			fichas[i] = ficha;
		}
		System.out.println("Pacientes do dia: ");
		for (int i = 0; i < fichas.length; i++) {
			System.out.println("[ " + fichas[i].toUpperCase() + " ] ");
		}
	}

	public void cadastrar() {
		ArrayList<String> nome = new ArrayList<String>();
		ArrayList<String> endereco = new ArrayList<String>();
		ArrayList<String> cpf = new ArrayList<String>();
		ArrayList<String> sus = new ArrayList<String>();
		ArrayList<Integer> idade = new ArrayList<Integer>();
		ArrayList<Double> peso = new ArrayList<Double>();
		ArrayList<Double> altura = new ArrayList<Double>();
		ArrayList<Boolean> dm = new ArrayList<Boolean>();
		ArrayList<Boolean> has = new ArrayList<Boolean>();
		
		try {
			do {
				System.out.println("______________________________________________________________");
				System.out.println("\nDigite 1 para cadastrar um novo paciente? ");
				System.out.println("\nDigite 2 para remover algum paciente cadastrado: ");
				System.out.println("\nDigite 3 para atualizar informações do paciente: ");
				System.out.println("\nDigite 4 para mostrar todos os pacientes cadastrados: ");
				System.out.println("\nDigite 0 para encerrar o programa? ");
				System.out.println("______________________________________________________________");
				prontuario = scan.nextInt();

				switch (prontuario) {
				case 1:
					scan.nextLine();
					System.out.println("\nDigite o nome do paciente que deseja adicionar: ");
					super.nome = scan.nextLine();
					nome.add(super.nome);
					System.out.println("\nDigite o endereço do paciente que deseja adicionar: ");
					super.endereco = scan.nextLine();
					endereco.add(super.endereco);
					System.out.println("\nDigite o CPF do paciente que deseja adicionar: ");
					super.cpf = scan.nextLine();
					cpf.add(super.cpf);
					System.out.println("\nDigite o cartão SUS do paciente: ");
					super.cartSus = scan.nextLine();
					sus.add(super.cartSus);
					System.out.println("\nDigite a idade do paciente: ");
					super.idade = scan.nextInt();
					idade.add(super.idade);
					System.out.println("\nDigite a altura do paciente no formato 0,00: ");
					super.altura = scan.nextDouble();
					altura.add(super.altura);
					System.out.println("\nDigite o peso do paciente no formato 00,0: ");
					super.peso = scan.nextDouble();
					peso.add(super.peso);
					System.out.println("\nPaciente hipertendo SIM ou NAO? ");
					super.has = scan.nextBoolean();
					has.add(super.has);
					System.out.println("\nPaciente diabético SIM ou NAO? ");
					super.dm = scan.nextBoolean();
					dm.add(super.dm);
					break;
				case 2:
					scan.nextLine();
					System.out.println("\nDigite o paciente que deseja remover: ");
					String paciente = scan.nextLine();
					if (nome.contains(paciente)) {
						nome.remove(paciente);
						System.out.println("Paciente removido com sucesso!!");
					} else {
						System.out.println("Paciente não consta no sistema.");
						for(int i = 0; i < nome.size(); i++) {
							System.out.println("Nome: " + nome.get(i) + "\nEndereço: " + endereco.get(i) + "\nCPF: " + cpf.get(i) + 
							"\nIdade: " + idade.get(i) + "\nAltura: " + altura.get(i) + "" + "\nPeso: " + peso.get(i) + "\nCartão do SUS: " 
							+ sus.get(i) + "\nDiabético: " + dm.get(i) + "\nHipertenso: " + has.get(i)+"\n");
					    }
					}
					break;
				case 3:
					scan.nextLine();
					System.out.println("\nDigite a informação que deseja atualizar: ");
					System.out.println("\nOpções: nome, idade, peso, altura, cartSus, has e dm");
					String verifica = scan.nextLine();
					switch (verifica) {
					case "nome":
						System.out.println("Digite o nome do paciente: ");
						String infoN = scan.nextLine();
						System.out.println("Digite o novo nome do paciente: ");
						String nomeNovo = scan.nextLine();
						if (nome.contains(infoN)) {
							nome.remove(infoN);
							nome.add(nomeNovo);
							System.out.println("Informação atualizada!");
						} else {
							System.out.println("Paciente não consta no sistema.");
						}
					break;
					case "endereco":
						System.out.println("Digite o endereço do paciente: ");
						String infoE = scan.nextLine();
						System.out.println("Digite o novo endereço do paciente: ");
						String enderecoNovo = scan.nextLine();
						if (endereco.contains(infoE)) {
							endereco.remove(infoE);
							endereco.add(enderecoNovo);
							System.out.println("Informação atualizada!");
						} else {
							System.out.println("Paciente não consta no sistema.");
						}
					break;
					case "cpf":
						System.out.println("Digite o CPF do paciente: ");
						String infoC = scan.nextLine();
						System.out.println("Digite o novo CPF do paciente: ");
						String cpfNovo = scan.nextLine();
						if (cpf.contains(infoC)) {
							cpf.remove(infoC);
							cpf.add(cpfNovo);
							System.out.println("Informação atualizada!");
						} else {
							System.out.println("Paciente não consta no sistema.");
						}
					break;
					case "idade":
						System.out.println("Digite a idade que consta no cadastro: ");
						String infoI = scan.nextLine();
						System.out.println("Digite a nova idade do paciente: ");
						int idadeNova = scan.nextInt();
						if (idade.contains(infoI)) {
							idade.remove(infoI);
							idade.add(idadeNova);
							System.out.println("Informação atualizada!");
						} else {
							System.out.println("Paciente não consta no sistema.");
						}
						break;
					case "altura":
						System.out.println("Digite a altura do paciente: ");
						String infoA = scan.nextLine();
						System.out.println("Digite o novo altura do paciente: ");
						Double alturaNova = scan.nextDouble();
						if (altura.contains(alturaNova)) {
						altura.remove(alturaNova);
						altura.add(alturaNova);
						System.out.println("Informação atualizada!");
						} else {
							System.out.println("Paciente não consta no sistema.");
						}
						break;
					case "peso":
						System.out.println("Digite o peso do paciente: ");
						String infoP = scan.nextLine();
						System.out.println("Digite o novo peso do paciente: ");
						Double pesoNovo = scan.nextDouble();
						if (peso.contains(infoP)) {
							peso.remove(infoP);
							peso.add(pesoNovo);
							System.out.println("Informação atualizada!");
						} else {
							System.out.println("Paciente não consta no sistema.");
						}
						break;
					case "sus":
						System.out.println("Digite a nova idade do informação do paciente: ");
						String infoS = scan.nextLine();
						System.out.println("Digite o novo nome do paciente: ");
						String susNovo = scan.nextLine();
						if (sus.contains(infoS)) {
							sus.remove(infoS);
							sus.add(susNovo);
							System.out.println("Informação atualizada!");
						} else {
							System.out.println("Paciente não consta no sistema.");
						}
						break;
					case "has":
						System.out.println("Digite se o paciente tem hipertensão: ");
						String infoH = scan.nextLine();
						System.out.println("Digite o novo diagnóstico: ");
						Boolean novoHas = scan.nextBoolean();
						if (has.contains(infoH)) {
							has.remove(infoH);
							has.add(novoHas);
							System.out.println("Informação atualizada!");
						} else {
							System.out.println("Paciente não consta no sistema.");
						}
						break;
					case "dm":
						System.out.println("Digite se o paciente tem diabetes mellitus: ");
						String infoD = scan.nextLine();
						System.out.println("Digite o novo nome do paciente: ");
						Boolean dmNovo = scan.nextBoolean();
						if (dm.contains(infoD)) {
							dm.remove(infoD);
							dm.add(dmNovo);
							System.out.println("Informação atualizada!");
						} else {
							System.out.println("Paciente não consta no sistema.");
						}
					    break;
					case "sair":
						System.out.println("\nFinalizou o programa!!!");
						break;
						default:
							System.out.println("\nOpção inválida!!!");
					}
				case 4:
					scan.nextLine();
					System.out.println("\nPacientes cadastrados no sistema: ");
					for(int i = 0; i < nome.size(); i++) {
						System.out.println("\nNome: " + nome.get(i) + "\nEndereço: " + endereco.get(i) + "\nCPF: " + cpf.get(i) + 
								"\nIdade: " + idade.get(i) + "\nAltura: " + altura.get(i) + "" + "\nPeso: " + peso.get(i) + "\nCartão do SUS: " 
								+ sus.get(i) + "\nDiabético: " + dm.get(i) + "\nHipertenso: " + has.get(i)+"\n");
				    }
					break;
				case 0:
					System.out.println("\nFinalizou o programa!!!");
					break;
					default:
						System.out.println("\nOpção inválida!!!");
				}
								
			} while (prontuario != 0);
			
		}catch (InputMismatchException inputMismatchException ) {
			System.err.println("Exceção: " + inputMismatchException);
			scan.nextLine();
			System.out.println("\nVocê deve inserir apenas com valores compatíveis.");
			
		}catch (ArithmeticException arithmeticException) {
			System.err.println("Exceção: " + arithmeticException);
			scan.nextLine();
			System.out.println("\nVocê deve entrar com um valor compatível!");

		}
			catch(IndexOutOfBoundsException indexout) {
			System.err.println("Exceção: " + indexout);
			scan.nextLine();
			System.out.println("\nLista menor que o índice inserido!");
		}
	}

	
	// MÉTODOS HERDADOS DA INTERFACE
	
	@Override
	public void temperatura(double testeTemperatura) {
		if (testeTemperatura >= 37.5) {
			System.out.println("Sua temperatura está acima de 37 graus, recomendo que faça o teste de COVID-19!");
		} else if (testeTemperatura < 37 || testeTemperatura > 35) {
			System.out.println("Temperatura adequada, pode entrar!");
		}
	}
    @Override
	public void cartaoVac(boolean CartaoVac) {
		if (CartaoVac == true) {
			System.out.println("Todas as vacinas para Covid-19 estão em dia, pode entrar e tirar a máscara se preferir");
		} else if (CartaoVac == false) {
			System.out.println(
					"Marque um dia para completar suas vacinas para Covid-19, ou tome agora se disponível, mas não poderá remover a máscara ou permeneccer por mais de 5 minutos na unidade!");
		}
	}

    // MÉTODO HERDADO DA SUPERCLASSE
    
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


