package br.com.ocpjp7.capitulo4.teste8;

public class Teste8 {

    public static void main(String[] args) {
        NoGenericClass valor = new NoGenericClass();
        System.out.println(valor);
    }
    
}


/*
 * Classe generica
 */
class GenericClass<T> {}

/*
 * Classe nao generica herdando de uma classe generica e passando o tipo desejado
 */
class NoGenericClass extends GenericClass<String> {}
