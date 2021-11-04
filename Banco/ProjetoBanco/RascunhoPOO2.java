package rascunhopoo.pkg2;

//'Import' usado para aplicar números aleatórios no Sistema
import java.util.Random;

public class RascunhoPOO2 {

    
    public static void main(String[] args) {
        //Instância da Classe Random (Gerador de números inteiros aleatórios)
        Random gerador = new Random();        
        
        //Instância da Classe 'RelacoesCliente' para relacao
        RelacoesClientes relacao = new RelacoesClientes();
        
        //Instancia da Classe 'ContaBanco' para c1(objeto)
        ContaBanco c1 = new ContaBanco("CC", "Jubileu");     
        c1.abrirConta(gerador.nextInt());
        c1.depositar(300);
        c1.pagarMensal();
        c1.statusGeral();       
        
        //Instancia da Classe 'ContaBanco' para c2(objeto)
        ContaBanco c2 = new ContaBanco("CP", "Creuza");
        c2.abrirConta(gerador.nextInt());
        c2.depositar(500);
        c2.sacar(100);
        c2.pagarMensal();
        c2.statusGeral();
        
        relacao.transferencia(c1, c2, 2500.45);//c1 vai receber R$2500 de c2
    }    
}
