package br.com.ocpjp7.capitulo2.teste12;

//Em um enum n�o � permitido acessar um _non-final static field_ no construtor do enum

public enum Pets {
	DOG("D"), CAT("C"), FISH("F");
	String prefix = "I am "; //static String prefix
	String name;
	Pets(String s) { 
		name = prefix + s; //Erro de compila��o
	}
	
	public String getData(){ return name; } 

}

//in file Pets.java 

/*
 * As constantes do enum deve ser declarada antes de qualquer coisa
 */
enum Pets2 {
//	String name; // Isso n�o pode ser acima das constantes
	
	DOG("D"), CAT("C"), FISH("F");
	
	Pets2(String s) {
		name = s;
	}
	
	String name;
	
}

/*
 * 
enum Pets2 {
	String name; // Isso n�o pode ser acima das constantes
	
	DOG("D"), CAT("C"), FISH("F");
	
	Pets2(String s) {
		name = s;
	}
}
 * 
 */
