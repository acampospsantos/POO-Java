package javaapplication39;

public class Caderno {
    String titulo;
    String capa;
    String idioma;
    int qtdFolhas;
    int materias;
    boolean aberto;
     
    void Status () {
        System.out.println ("O título é: " + this.titulo);
        System.out.println ("A Capa é: " + this.capa);
        System.out.println ("O idioma é: " + this.idioma);
        System.out.println ("O número de folhas é: " + this.qtdFolhas);
        System.out.println ("O número de matérias é: " + this.materias);
        System.out.println ("O caderno está aberto? " + this.aberto);
    }
    
    
    public void Ler () {
        if (this.aberto == true) {
            System.out.println ("Lendo....");
        } else {
            System.out.println ("Não é possível ler! O caderno está fechado!");
        }
    }
    
    public void Abrir () {
        this.aberto = true;        
    }
    
    public void Fechar () {
        this.aberto = false;        
    }
    
    
}
