package br.com.ocpjp7.capitulo1.teste1;

import java.util.Calendar;

class A {
	
	public A() {
		super();
	}

	public A(String s){
		this();
		System.out.println("A :" + s);
	}
	
}

class B extends A {
	
	public int B(String s) {
		System.out.println("B :" + s);
		return 0;
	}

	public B() {
		super();
	}

}

class C extends B {

	private C() {
		super();
	}
	
	public C(String s){
		this();
		System.out.println("C :"+s);
	}
	
	public C(int i){}
	
}

public class Teste1 {
	
	public static void main(String[] args) {
		
		//06/07
		
		Calendar dataInicioRegra = Calendar.getInstance();
		dataInicioRegra.set(2016, Calendar.JULY, 6, 0, 0, 0);
		dataInicioRegra.set(Calendar.MILLISECOND, 0);
		
		System.out.println(dataInicioRegra.getTime());
		
		
	}
	
	
}

















