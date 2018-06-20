package br.com.ocpjp7.capitulo2.teste10;

public class Teste10 {

	public static void main(String[] args) {
		
		Switch s = Switch.OFF;
		
		switch (s) {
		case OFF: // Deve ser utilizado somente o OFF
			System.out.println("It is off!");
			break;
		}

	}

}

enum Switch {
	ON, OFF
}
