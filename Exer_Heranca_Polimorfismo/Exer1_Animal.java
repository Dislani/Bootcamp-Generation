package Heranca;

public class Animal {
	
	/*1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:*/
	
	
	protected String possuiNome;
	protected String DeveCorrer;
	protected String DeveEmitirSom;
	protected int possuiIdade;
	
	
	public Animal (String possuiNome, String DeveCorrer, String DeveEmitirSom,int possuiIdade) {
		
	}
	



	public String getPossuiNome() {
		System.out.println();
		return possuiNome;
	}
	public void setPossuiNome(String possuiNome) {
		this.possuiNome = possuiNome;
	}
	public String getDeveCorrer() {
		System.out.println();
		return DeveCorrer;
	}
	public String setDeveCorrer(String deveCorrer) {
		return DeveCorrer = deveCorrer;
	}
	public String getDeveEmitirSom() {
		System.out.println();
		return DeveEmitirSom;
	}
	public void setDeveEmitirSom(String deveEmitirSom) {
		DeveEmitirSom = deveEmitirSom;
	}
	public int getPossuiIdade() {
		return possuiIdade;
	}
	public void setPossuiIdade(int possuiIdade) {
		this.possuiIdade = possuiIdade;
	}
	
	
	
	
}


