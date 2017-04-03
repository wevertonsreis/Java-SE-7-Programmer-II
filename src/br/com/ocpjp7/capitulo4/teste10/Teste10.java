package br.com.ocpjp7.capitulo4.teste10;

public class Teste10 {
    
    public static void main(String[] args) {
        
        Parcel<Book> valor1 = new Parcel<>();
        Parcel<Phone> valor2 = new Parcel<>();
        
        //Parcel<Object> valor3 = new Parcel<>(); -> Não pode
        
        
    }
    
}

abstract class Gift {
    abstract double getWeight();
}

class Book extends Gift {
    public double getWeight() {
        return 3.2;
    }
}

class Phone extends Gift {
    public double getWeight() {
        return 1.1;
    }
}

/*
 * Dessa maneira você não tem acesso ao metodo getWeight()
 * 
class Parcel<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public void shipParcel() {
        if (t.getWeight() > 10)
            System.out.println("Ship by courier ABC");
        else
            System.out.println("Ship by courier XYZ");
    }
}
*/

class Parcel<T extends Gift> { 
    private T t; // t pode ser qualquer filho de Gift

    public void set(T t) {
        this.t = t;
    }

    public void shipParcel() {
        double valor = t.getWeight(); 
        System.out.println(valor);
    }
}
