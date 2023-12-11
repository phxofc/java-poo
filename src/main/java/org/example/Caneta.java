package org.example;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String modelo, String cor, float ponta) {
        this.setCor(cor);
        this.setModelo(modelo);
        this.setPonta(ponta);
        this.tampar();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }


    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("MODELO: "+ this.getModelo());
        System.out.println("PONTA :"+this.getPonta());
        System.out.println("COR:"+this.cor );
        System.out.println("TAMPADA:"+this.tampada );

    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}
