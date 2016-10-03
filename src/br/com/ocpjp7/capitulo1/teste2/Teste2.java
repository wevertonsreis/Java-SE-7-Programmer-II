package br.com.ocpjp7.capitulo1.teste2;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

interface I1 {
	void m1() throws java.io.IOException;
} 

interface I2 {
	void m1() throws java.io.FileNotFoundException;
}

public class Teste2 implements I1, I2 {

	@Override
	public void m1()throws RuntimeException {
		
	}
	
	public static void main(String[] args) {
		//11/11/2002
		
		Timestamp time2 = new Timestamp(2011,11,11,0,0,0,0);
		
		Timestamp time = new Timestamp(20021111L);
		
		System.out.println(time2);
		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
		System.out.println(format.format(time2));
		
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
	int getStatusCode(Object obj) {
		return 0;
	}
	
}

