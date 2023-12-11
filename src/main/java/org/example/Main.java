package org.example;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC","AMARELA",0.4F);
        c1.status();
        System.out.println("==========");
        Caneta c2 = new Caneta("TESTE","LARANJA",0.2F);
        c2.status();
    }


}