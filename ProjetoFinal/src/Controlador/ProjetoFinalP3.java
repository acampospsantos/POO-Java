package Controlador;

import Modelo.Carro;
import Modelo.Concessionária;
import Modelo.Usuário;
import Modelo.Vendas;

public class ProjetoFinalP3 {

    
    public static void main(String[] args) {
        //Intanciamento da Classe Carro
        Carro carro = new Carro("Ferrari", "Vermelho", 2015, 50000, 1987);
        //Instanciamento da Classe Concessionária
        Concessionária concessionaria = new Concessionária();
        //Instanciamento da Classe Usuário
        Usuário user = new Usuário("Anderson", 600000);
        //Instanciamento da Classe Vendas
        Vendas v = new Vendas();
        
        
        //MÉTODOS DA APLICAÇÃO
       
        //Depósito na conta do Cliente
        concessionaria.depositarSaldo(user, 600000);
         //Adicionei o carro (que foi instanciado) 
        concessionaria.adicionarCarro(carro);
        
                
        //Métodos da Interface 
        v.analisar(1987);
        v.comprar(1987);
        
        
    }    
}


//***** CLASSE PRINCIPAL *****