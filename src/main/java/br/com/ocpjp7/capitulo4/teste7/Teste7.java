package br.com.ocpjp7.capitulo4.teste7;

public class Teste7 {
    
    public static void main(String[] args) {
        
        GenericBookParcel<String, Integer> valor = new GenericBookParcel<>();
        
    }
    
}

/*
Dessa maneira a classe não compila de vido o parametro T não esta sendo enviado para a classe pai

class Parcel<T> {}

class GenericBookParcel<X> extends Parcel<T> {}

*/

/*
 * Dessa maneira funciona
 */
class Parcel<T> {}

class GenericBookParcel<X, T> extends Parcel<T> {}