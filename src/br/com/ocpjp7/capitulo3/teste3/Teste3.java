package br.com.ocpjp7.capitulo3.teste3;

public class Teste3 {}

// essa class não e um singleton
class SpeedSensor {
	
	// construtor privado
	private SpeedSensor(){}
	
	// metodo static que sempre retorna uma nova instancia da propria classe
	public static SpeedSensor getInstance(){
		return new SpeedSensor();
	} 

}