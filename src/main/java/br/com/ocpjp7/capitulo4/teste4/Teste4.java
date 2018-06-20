package br.com.ocpjp7.capitulo4.teste4;

import java.util.ArrayDeque;
import java.util.Queue;

public class Teste4 {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new ArrayDeque<>();
		fila.add("Cliente 1");
		fila.add("Cliente 2");
		fila.add("Cliente 3");
		
		System.out.println("COMO ESTA A FILA DE ATENDIMENTO");
		for (String string : fila) {
			System.out.println(string);
		}
		System.out.println();
		
		/*
		 * Se nao tem nada na fila retorna null
		 */
		System.out.println("VERIFICANDO QUEM E O PROXIMO SEM FAZER NADA = " + fila.peek());
		System.out.println();
		
		System.out.println("COMO ESTA A FILA DE ATENDIMENTO");
		for (String string : fila) {
			System.out.println(string);
		}
		System.out.println();
		
		/*
		 * Se nao tem nada na fila lanca NoSuchElementException 
		 */
		System.out.println("VERIFICANDO QUEM E O PROXIMO SEM FAZER NADA DE UMA MANEIRA DIFERENTE = " + fila.element());
		System.out.println();
		
		System.out.println("COMO ESTA A FILA DE ATENDIMENTO");
		for (String string : fila) {
			System.out.println(string);
		}
		System.out.println();
		
	}
	
}
