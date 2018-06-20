package br.com.ocpjp7.capitulo2.teste2;

public class Teste2 {

	private String strPrivada = "private";
	protected String strProtegida = "protected";;
	String strPadrao = "default";
	public String strPublica = "public";;
	
	// inner class
	public class Inner{
		
		private void teste() {
			// Independente do modificador de acesso, os membros pode ser utilizado na inner class
			
			System.out.println(strPrivada);
			System.out.println(strProtegida);
			System.out.println(strPadrao);
			System.out.println(strPublica);
			
			System.out.println(Teste2.this.strPrivada);
			System.out.println(Teste2.this.strProtegida);
			System.out.println(Teste2.this.strPadrao);
			System.out.println(Teste2.this.strPublica);
		}
		
	}
	
	// static inner class
	public static class InnerStatic{
		
		private void teste() {
			// Os membros da outer class nao são static então nao compila
			
//			System.out.println(strPrivada);
//			System.out.println(strProtegida);
//			System.out.println(strPadrao);
//			System.out.println(strPublica);
//			
//			System.out.println(Teste2.this.strPrivada);
//			System.out.println(Teste2.this.strProtegida);
//			System.out.println(Teste2.this.strPadrao);
//			System.out.println(Teste2.this.strPublica);
			System.out.println("Teste");
		}
		
	}
	
	public static void main(String[] args) {
		//Para funcionar deve existir uma instancia de Teste2
//		new Inner();
		
		new Teste2().new Inner().teste();
		
		new InnerStatic().teste();
		
		new Teste2.InnerStatic().teste();
		
	}
	
}
