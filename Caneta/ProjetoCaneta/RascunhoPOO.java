package rascunhopoo;


public class RascunhoPOO {

    public static void main(String[] args) {
        //(Classe) (Objeto) = new (Classe)  ---> Instanciamento
        Caneta c1 = new Caneta("BIC", "Azul", 0.5 , 80, true);
        
        c1.setModelo("Faber Castell");
        c1.destampar();
        c1.destampar();
        c1.rabiscar();
        c1.tampar();
        c1.status();
    }
    
}
