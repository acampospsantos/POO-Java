package javaapplication40;

import java.util.Scanner;

public class JavaApplication40 {

    public Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {
       Celular c1 = new Celular("Apple", "Iphone", 128);
       c1.bateria = 80;
       c1.ligado = true;
       
       c1.Desligar();
       c1.Jogar();
       System.out.println("_______________");
       c1.Status();
       System.out.println("---------------");
    }    
}
