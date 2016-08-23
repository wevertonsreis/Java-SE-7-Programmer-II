package br.com.ocpjp7.capitulo1.teste6;

class Teste6 {

   public static void main(String[] args){
      String s = "going";
      print(s,  s = "gone");
   }
   
   static void print(String a, String b){
      System.out.println(a +", "+ b );
   }
   
}