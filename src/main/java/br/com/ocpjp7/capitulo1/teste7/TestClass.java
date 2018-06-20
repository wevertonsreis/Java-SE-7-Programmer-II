package br.com.ocpjp7.capitulo1.teste7;

class Super {
}

class Sub extends Super {
}

public class TestClass {

	public static void main(String[] args) {
		Super s1 = new Super(); // 1
		Sub s2 = new Sub(); // 2
		s1 = (Super) s2; // 3
	}
}

