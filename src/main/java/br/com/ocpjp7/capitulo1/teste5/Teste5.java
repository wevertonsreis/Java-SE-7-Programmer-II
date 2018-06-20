package br.com.ocpjp7.capitulo1.teste5;

class A {}

class B extends A {}

class C extends B {}

class D extends C {}

public class Teste5 {

	public static void main(String[] args) {
		D d = new D();

		System.out.println("d instanceof A? " + (d instanceof A));
		System.out.println("d instanceof B? " + (d instanceof B));
		System.out.println("d instanceof C? " + (d instanceof C));
		System.out.println("d instanceof D? " + (d instanceof D));
		
	}

}
