package br.com.ocpjp7.capitulo4.teste12;

import java.util.ArrayList;
import java.util.List;

public class Teste12 {
    
    public static void main(String[] args) {
        
        List<? extends Gift> teste = new ArrayList<Book>();
        
        teste.get(0).testeG();
        
        List<? super Gift> list = new ArrayList<>();
        
        list.add(new Book());
        list.add(new Gift());
        list.add(new Phone());
        
    }
}

class Gift{
    public void testeG(){}
}

class Book extends Gift{}

class Phone extends Gift{}
