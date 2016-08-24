package br.com.ocpjp7.capitulo2.teste1;

public class Onion {
	private String data = "skin";

	private class Layer extends Onion {
		String data = "thegoodpart";

		public String getData() {
			return data;
		}
		
		public String getDataDoOnion() {
			return Onion.this.data;
		}
	}

	public String getData() {
		return new Layer().getData();
	}
	
	public String getDataDoOnion() {
		return new Layer().getDataDoOnion();
	}

	public static void main(String[] args) {
		Onion o = new Onion();
		System.out.println(o.getData());        // thegoodpart
		System.out.println(o.getDataDoOnion()); // skin
	}
}
