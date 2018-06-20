package br.com.ocpjp7.capitulo2.teste6;

public class Teste6 {
	
	// static inner class
	public static class InnerStatic {
		// inner class dentro de uma static inner class
		class InnerInner {}
	}
	
	public static void main(String[] args) {
		// instanciando uma classe que esta dentro da static inner class
		new Teste6.InnerStatic().new InnerInner();
	}
	
}
