package br.com.ocpjp7.capitulo4.teste3;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Queue;

public class Teste3 {
	
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
		 * Retorna null se não tem nada na fila
		 */
		System.out.println("ATENDENDO O CLIENTE = " + fila.poll());
		System.out.println();
		
		System.out.println("COMO ESTA A FILA DE ATENDIMENTO");
		for (String string : fila) {
			System.out.println(string);
		}
		System.out.println();
		
		/*
		 * Lanca NoSuchElementException se não tem nada na fila (Essa é a diferenca entre o metodo poll) 
		 */
		System.out.println("ATENDENDO O CLIENTE = " + fila.remove());
		System.out.println();
		
		System.out.println("CHEGOU MAIS UM CLIENTE = " + fila.add("Cliente 4"));
		System.out.println();
		
		System.out.println("COMO ESTA A FILA DE ATENDIMENTO");
		for (String string : fila) {
			System.out.println(string);
		}
		System.out.println();
		
		
	}
	
}
