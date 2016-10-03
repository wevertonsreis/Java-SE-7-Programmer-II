package br.com.ocpjp7.capitulo4.teste2;

public class Teste2 {

	public static void main(String[] args) {
		
		// funciona sem warn
		Fruta<Long> fruta1 = new Laranja<Long>();
		fruta1.setNome(new Long("2"));
//		fruta1.setNome("22"); não compila

		System.out.println(fruta1);
		
		// funciona sem warn
		Fruta<Long> fruta2 = new Laranja<>();
		fruta2.setNome(new Long("2"));
//		fruta2.setNome("22"); não compila

		System.out.println(fruta2);
		
		// funciona com warn
		Fruta fruta3 = new Laranja<Long>();
		fruta3.setNome(new Long("2"));
		
		System.out.println(fruta3);
		
		fruta3.setNome("www");
		
		System.out.println(fruta3);
		
		// funciona com warn
		Fruta<Long> fruta4 = new Laranja();
//		fruta4.setNome("www"); não compila
		
		System.out.println(fruta4);
		
		// funciona com warn
		Fruta fruta5 = new Laranja();
		fruta5.setNome("teste");
		
		System.out.println(fruta5);
		
		fruta5.setNome(new Long("33"));
		
		System.out.println(fruta5);
	}

}

/**
 * 
 * @author Weverton
 *
 * @param <E>
 */
class Fruta<E> {

	E nome;

	public E getNome() {
		return nome;
	}

	public void setNome(E nome) {
		this.nome = nome;
	}

}

class Laranja<E> extends Fruta<E> {

	@Override
	public String toString() {
		return "Laranja [nome=" + nome + "]";
	}
	
}
