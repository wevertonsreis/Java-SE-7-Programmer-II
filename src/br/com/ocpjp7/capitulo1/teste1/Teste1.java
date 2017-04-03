package br.com.ocpjp7.capitulo1.teste1;

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
