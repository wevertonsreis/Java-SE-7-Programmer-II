package br.com.ocpjp7.capitulo4.teste5;

import java.util.ArrayList;
import java.util.List;

public class Teste5 {
    
    public static void main(String[] args) {
        
        List listaAntes = new ArrayList();
        listaAntes.add("A");
        listaAntes.add(Integer.valueOf("2"));
        
        for (Object object : listaAntes) {
            String valor = (String) object; // Erro em tempo de execução
        }
        
        List<String> listaDepois = new ArrayList<>();
        listaDepois.add("A");
//        listaDepois.add(Integer.valueOf("2")); // Não compila
        
    }
    
}