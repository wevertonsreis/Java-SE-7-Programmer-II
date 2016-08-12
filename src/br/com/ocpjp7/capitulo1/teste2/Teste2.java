package br.com.ocpjp7.capitulo1.teste2;

import java.io.FileNotFoundException;

interface I1 {
	void m1() throws java.io.IOException;
} 

interface I2 {
	void m1() throws java.io.FileNotFoundException;
}

public class Teste2 implements I1, I2 {

	@Override
	public void m1() throws FileNotFoundException {
		
	}
	
}

class TaskBase {
	
	int getStatusCode(Object obj) throws NullPointerException {
		if(obj != null ) 
			return 1;
		else 
			return 0;
	} 
} 

class Filha extends TaskBase {
	
	@Override
	int getStatusCode(String obj) {
		return super.getStatusCode(obj);
	}
	
}

