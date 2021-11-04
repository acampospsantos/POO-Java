package javaapplication39;

import java.util.Scanner;

public class JavaApplication39 {

    public static Scanner entrada = new Scanner (System.in);
    
    public static void main(String[] args) {
        //Criação do 1° Objeto (Instanciamento)
        Caderno c1 = new Caderno();
        //Declaração dos Atributos
        c1.titulo = "Cálculo para leigos";
        c1.capa = "Dura";
        c1.idioma = "Português";
        c1.qtdFolhas = 300;
        c1.materias = 12;
        c1.aberto = true;       
        //Declaração dos Métodos
        c1.Abrir();
        c1.Ler();
        c1.Status();        
    }
    
}
