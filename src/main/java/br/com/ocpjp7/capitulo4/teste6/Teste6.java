package br.com.ocpjp7.capitulo4.teste6;

public class Teste6 {
    
    public static void main(String[] args) {
        
        GenericClass<String> teste = new GenericClass<>();
        
        teste.getT(); // Isso é uma string não MyClass
        
    }
}

class MyClass {}

/* Mesmo o nome sendo igual a classe ele e utilizado omo parametro*/
class GenericClass<MyClass> {
    
    private MyClass t;

    public MyClass getT() {
        return t;
    }
    
}
