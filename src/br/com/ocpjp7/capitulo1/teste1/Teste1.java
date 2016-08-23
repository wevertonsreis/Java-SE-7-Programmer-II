package br.com.ocpjp7.capitulo1.teste1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

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
	
		BigDecimal valorBruto1 = new BigDecimal("139.96");
		BigDecimal valorBruto2 = new BigDecimal("163.69");
		BigDecimal valorBruto3 = new BigDecimal("176.8");
		BigDecimal valorBruto4 = new BigDecimal("176.8");
		BigDecimal valorBruto5 = new BigDecimal("176.8");
		BigDecimal valorBruto6 = new BigDecimal("203.66");
		BigDecimal valorBruto7 = new BigDecimal("227.01");
		BigDecimal valorBruto8 = new BigDecimal("248.88");
		BigDecimal valorBruto9 = new BigDecimal("250.46");
		BigDecimal valorBruto10 = new BigDecimal("257.84");
		BigDecimal valorBruto11 = new BigDecimal("257.84");
		BigDecimal valorBruto12 = new BigDecimal("266.67");
		BigDecimal valorBruto13 = new BigDecimal("266.67");
		BigDecimal valorBruto14 = new BigDecimal("266.67");
		BigDecimal valorBruto15 = new BigDecimal("266.67");
		BigDecimal valorBruto16 = new BigDecimal("266.67");
		BigDecimal valorBruto17 = new BigDecimal("266.67");
		BigDecimal valorBruto18 = new BigDecimal("273.77");
		
		List<BigDecimal> lancamentos = new ArrayList<BigDecimal>();
		
		lancamentos.add(valorBruto1);
		lancamentos.add(valorBruto2);
		lancamentos.add(valorBruto3);
		lancamentos.add(valorBruto4);
		lancamentos.add(valorBruto5);
		lancamentos.add(valorBruto6);
		lancamentos.add(valorBruto7);
		lancamentos.add(valorBruto8);
		lancamentos.add(valorBruto9);
		lancamentos.add(valorBruto10);
		lancamentos.add(valorBruto11);
		lancamentos.add(valorBruto12);
		lancamentos.add(valorBruto13);
		lancamentos.add(valorBruto14);
		lancamentos.add(valorBruto15);
		lancamentos.add(valorBruto16);
		lancamentos.add(valorBruto17);
		lancamentos.add(valorBruto18);
		
		BigDecimal percentual = new BigDecimal("0.20");
		
		BigDecimal valorTotalLancado = new BigDecimal("0.00");
		
		for (BigDecimal valor : lancamentos) {
			BigDecimal valorBrutoComContribuicaoPatronal = valor;
			valorBrutoComContribuicaoPatronal = valorBrutoComContribuicaoPatronal.add(percentual.multiply(valorBrutoComContribuicaoPatronal));
			
			System.out.println("VALOR SEM CONTRIBUICAO = " + valor + " VALOR COM CONTRIBUICAO = " + valorBrutoComContribuicaoPatronal);
			
		}
		
	}
	
	
}

















