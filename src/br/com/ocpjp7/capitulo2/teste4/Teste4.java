package br.com.ocpjp7.capitulo2.teste4;

public final class Teste4 {

	class Inner {}
	
	public static void main(String[] args) {
		
		Teste4 teste4 = new Teste4();
		
		Inner inner1 = teste4.new Inner();
		Inner inner2 = teste4.new Inner();
		
		System.out.println("Estão apontandos para o mesmo objeto = " + (inner1 == inner2));
	}

}
