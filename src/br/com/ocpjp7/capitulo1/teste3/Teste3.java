package br.com.ocpjp7.capitulo1.teste3;

import java.io.IOException;
import java.sql.SQLException;

interface I1{
	void m1() throws IOException;
}

interface I2{
	void m1() throws SQLException;
}

public class Teste3 implements I1, I2 {

	@Override
	public void m1() throws RuntimeException {}

}
