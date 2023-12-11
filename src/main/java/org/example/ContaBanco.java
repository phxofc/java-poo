package org.example;

import java.sql.SQLOutput;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void estadoAtual(){
        System.out.println("=========================");
        System.out.println("CONTA: "+this.getNumConta());
        System.out.println("TIPO: "+this.getTipo());
        System.out.println("DONO: "+this.getDono());
        System.out.println("SALDO: "+this.getSaldo());
        System.out.println("STATUS: "+this.isStatus());
    }



    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
            this.saldo = 50;
            System.out.println("CONTA CORRENTE ABERTA COM SUCESSO");
        }
        else if(t == "CP"){
            this.saldo = 150;
            System.out.println("CONTA POUPANÇA ABERTA COM SUCESSO");
        }

    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("IMPOSSIVEL FECHAR A CONTA POIS HÁ SALDO !");
        }else if(this.getSaldo() < 0){
            System.out.println("VOCÊ ESTÁ EM DÉBITO");
        }else{
            this.setStatus(false);
            System.out.println("CONTA FECHADA COM SUCESSO");
        }

    }
    public void depositar(float deposito){
        if(this.isStatus()==true){
            this.setSaldo(getSaldo()+deposito);
            System.out.println("SALDO DEPOSITADO COM SUCESSO");
        }else{
            System.out.println("A CONTA NÃO EXISTE");
        }
    }
    public void sacar(float saque){

        if(this.isStatus() == true){
            if(this.getSaldo() >= saque){
                this.setSaldo(getSaldo()-saque);
                System.out.println("SAQUE REALIZADO COM SUCESSO");
            }else{
                System.out.println("SALDO INSULFICIENTE");
            }


        }else{
            System.out.println("A CONTA NÃO EXISTE");
        }

    }
    public void pagarMensal(){
        float v =0;
        if(this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v =20;
        }
        if(this.isStatus()== true){
            if (this.getSaldo()> v){
                this.setSaldo(getSaldo()- v);
            }else{
                System.out.println("SALDO INSULFICIENTE");
            }
        }else{
            System.out.println("A CONTA NÃO EXISTE");
        }

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
