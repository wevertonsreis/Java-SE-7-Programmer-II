package br.com.ocpjp7.capitulo1.teste4;

class A {
	
  private int i;
  
  public void modifyOther(A a1) {
	  a1.i = 20;
  }

}

public class Teste4 {
	
	private int x;
	
	public static void main(String[] args) {
		
		Teste4 teste4 = new Teste4();
		teste4.x = 1;
		
	}
	
}