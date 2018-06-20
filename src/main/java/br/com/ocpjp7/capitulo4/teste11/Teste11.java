package br.com.ocpjp7.capitulo4.teste11;

public class Teste11 extends Gift implements Wrappable, Exchangeable {

    public static void main(String[] args) {      
        Parcel<Teste11> teste = new Parcel<>();    
    }

    @Override
    public void fazerE() {
    }

    @Override
    public void fazerW() {
    }
    
}

interface Wrappable{ 
    void fazerW();  
}

interface Exchangeable{   
    void fazerE(); 
}

class Gift {
    public void fazerG(){}
}

class Parcel <T extends Gift & Exchangeable & Wrappable>{
    
    T t;
    
    public void teste() {
        
        t.fazerW();
        t.fazerE();
        t.fazerG();
        
    }
    
}

