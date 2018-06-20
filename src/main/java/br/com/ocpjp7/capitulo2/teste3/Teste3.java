package br.com.ocpjp7.capitulo2.teste3;

public class Teste3 {

	private String nome = "Eu sou Outer";;
	
	class Inner extends Teste3 {
		
		private String nome = "Eu sou Inner";

		public String getNome() {
			return nome;
		}
		
		public String getNomeOuter() {
			return Teste3.this.nome;
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(new Teste3().new Inner().nome); //Eu sou Inner
		
		System.out.println(new Teste3().nome); //Eu sou Outer
		
		System.out.println(new Teste3().new Inner().getNomeOuter()); //Eu sou Outer	
	}

}
