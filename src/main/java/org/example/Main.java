package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    ContaBanco c1 = new ContaBanco();
    ContaBanco c2 = new ContaBanco();

        c1.setNumConta(111);
        c1.setDono("pedro");
        c1.abrirConta("CC");
        c1.depositar(100);
       c1.sacar(50);
       c1.sacar(100);
        c1.fecharConta();
        c1.estadoAtual();



    }


}