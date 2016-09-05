package br.com.ocpjp7.capitulo3.teste2;

public class Teste2 {}

// singleton classe
class SpeedSensor {
	
	// membro static do proprio tipo da classe
	private static SpeedSensor theInstance = new SpeedSensor();
	
	// construtor privado, para nao deixar instanciar
	private SpeedSensor(){}
	
	// metodo static que retorna o membro static 
	public static SpeedSensor getInstance(){
		return theInstance;
	}

}
