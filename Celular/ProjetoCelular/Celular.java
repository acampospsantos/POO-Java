package javaapplication40;

public class Celular {

    String marca;
    String tipo;
    double memoria;
    int bateria;
    boolean ligado;

    public Celular (String marca, String tipo, double memoria) {
        this.marca = marca;
        this.tipo = tipo;
        this.memoria = memoria;
    }
    
    
    
    public void Status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Memoria: " + this.memoria + "Gb");
        System.out.println("Bateria: " + this.bateria + "%");
        System.out.println("Ligado = " + this.ligado);
    }

    public void Ligar() {
        this.ligado = true;
    }

    public void Desligar() {
        this.ligado = false;
    }

    public void Ligacao() {
        if (this.ligado == false) {
            System.out.println("ERRO");
            System.out.println("**O CEL ESTÁ DESLIGADO!!**");
        } else {
            System.out.println("Ligando.....");
        }
    }

    public void enviarSms() {
        if (this.ligado == false) {
            System.out.println("Não é possível enviar um SMS!");
            System.out.println("**O CEL ESTÁ DESLIGADO!!**");
        } else {
            System.out.println("Enviando...");
        }
    }

    public void Jogar() {
        if (this.ligado == false) {
            System.out.println("ERRO");
            System.out.println("**O CEL ESTÁ DESLIGADO!!**");
        } else {
            if (this.bateria > 20) {
                System.out.println("Jogando...");
            } else {
                System.out.println("ERRO");
                System.out.println("Bateria abaixo de 20%");
            }
        }
    }
}
