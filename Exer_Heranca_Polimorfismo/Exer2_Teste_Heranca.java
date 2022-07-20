package Heranca;

public class TesteHeranca {

	public static void main(String[] args) {
		
		/*- Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.*/
		
		
		Cachorro animal1= new Cachorro(null, null, null, 0);
		Cavalo animal2= new Cavalo(null, null, null, 0);
		Preguica animal3= new Preguica(null, null, null, 0);
	 
		animal1.getNomeDoAnimal();
		animal1.getSomEmitido();
		
	
		System.out.println("\n*******************************************");
		
		
		animal2.getNomeDoAnimal();
		animal2.getSomEmitido();
		
		System.out.println("\n*******************************************");
		
		
		animal3.getNomeDoAnimal();
		animal3.getSomEmitido();
		

	}

}
