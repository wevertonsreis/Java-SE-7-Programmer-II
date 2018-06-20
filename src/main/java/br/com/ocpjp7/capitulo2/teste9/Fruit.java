package br.com.ocpjp7.capitulo2.teste9;

interface Eatable{
    int types = 10;
}

class Food implements Eatable {
    public static int types = 20;
}

public class Fruit extends Food implements Eatable {  //LINE1
    
	/*
	 * Aqui o codigo não compila nas duas linhas devido a ambiguidade
	 */
    public static void main(String[] args) {
//        types = 30; //LINE 2
//        System.out.println(types); //LINE 3
    }
    
}
