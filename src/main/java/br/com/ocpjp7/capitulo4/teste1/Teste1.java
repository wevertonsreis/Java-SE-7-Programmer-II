package br.com.ocpjp7.capitulo4.teste1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Teste1 {
	
	public static void main(String[] args) {
		
		Deque<String> listDeque = new ArrayDeque<String>();
		
		// Adicionando no final
		listDeque.add("D");
		listDeque.addLast("E");
		listDeque.offer("F");
		listDeque.offerLast("G");
		
		// Adicionando no começo
		listDeque.addFirst("A");
		listDeque.offerFirst("B");
		listDeque.push("C");
		
		for (String string : listDeque) {
			System.out.println(string);
		}
		
		System.out.println("\nREMOVENDO DO COMEÇO");
		System.out.println("Removendo = " + listDeque.remove());
		System.out.println("Removendo = " + listDeque.removeFirst());
		System.out.println("Removendo = " + listDeque.pop());
		
		System.out.println("\nREMOVENDO DO FINAL");
		System.out.println("Removendo = " + listDeque.removeLast());
		
		System.out.println("\nDEQUE DEPOIS DA REMOVE");
		for (String string : listDeque) {
			System.out.println(string);
		}
		
		System.out.println("\nPEGANDO DO COMEÇO");
		System.out.println("Pegando = " + listDeque.element());
		System.out.println("Pegando = " + listDeque.getFirst());
		System.out.println("Pegando = " + listDeque.peek());
		System.out.println("Pegando = " + listDeque.peekFirst());
	
		System.out.println("\nPEGANDO DO FINAL");
		System.out.println("Pegando = " + listDeque.peekLast());
		
		System.out.println("\nPEGANDO E REMOVENDO DO COMEÇO");
		System.out.println("Pegando = " + listDeque.poll());
		System.out.println("Pegando = " + listDeque.pollFirst());
		
		System.out.println("\nPEGANDO E REMOVENDO DO FINAL");
		System.out.println("Pegando = " + listDeque.pollLast());
		
	}
	
}
