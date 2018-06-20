package br.com.ocpjp7.capitulo3.teste1;

public class Teste1 {}

// singleton classe
class SpeedSensor {
	
	// construtor privado
	private SpeedSensor(){}
	
	// static inner class
	private static class SpeedSensorHolder {
		
		// membro static do tipo da outer class
		public static SpeedSensor ss = new SpeedSensor();
	} 
	
	// metodo static que retorna a instancia do tipo dessa classe
	public static SpeedSensor getSpeedSensor() {
		return SpeedSensorHolder.ss;
	}

}