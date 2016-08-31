package br.com.ocpjp7.capitulo2.teste13;

import java.awt.event.ActionEvent;

public class Teste13 {
}

/*
 * Membro _static_ em _non static inner class_ não funciona, só se for _final_.
 */
class Outer {
	class Inner {
		static final int k = 10;
	}
}

//outer class
class TestClass {
	
	//construtor com parametro
	public TestClass(int i) {}

	//método de instancia
	public void m1() {
		
		//classe anonima utilizando o contrutor que tem um parametro
		TestClass al = new TestClass(10) {
			
			public void actionPerformed(ActionEvent e) {
			}
			
		};
	}
	
	class Inner {
		
		//nao pode ser static
		public void teste() {}
		
	}
	
}
