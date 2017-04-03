package br.com.ocpjp7.capitulo4.teste9;

public class Teste9 {
    
    public static void main(String[] args) {
        
        Phone<Double> teste = new Phone<>("Teste");
        
        System.out.println(teste);
        
    }
    
}

class Phone<X> {
    
    <T> Phone(T t) {
        System.out.println(t);
    }
    
}
