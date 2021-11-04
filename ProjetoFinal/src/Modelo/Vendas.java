package Modelo;

import Visao.Interface;

//A Classe Vendas herda as características e Métodos da Classe Carro
//A Classe Vendas vai implementar o Código dos Métodos abstratos da Interface
public class Vendas extends Concessionária implements Interface {

       
    

    //Métodos abstratos (da Interface)
    @Override
    public void comprar(int codigo) {
        if (procurarCarro(codigo) == -1) {
            System.out.println("**Não foi possível adicionar o carro para compra**");
        } else {            
            this.carros[procurarCarro(codigo)] = procurarCodigoCarro(codigo);
            if (this.usuario.getSaldo() >= this.carros[procurarCarro(codigo)].getPreço()) {
                this.usuario.setSaldo(this.usuario.getSaldo() - this.carros[procurarCarro(codigo)].getPreço());
                //Remoção do Carro selecionado do Catálogo
                removerCarro(this.carros[procurarCarro(codigo)]);
                System.out.println("## COMPRA EFETUADA ##");
            } else {
                System.out.println("Saldo Insuficiente");
            }
        }
    }

    @Override
    public void analisar(int codigo) {
         if (procurarCarro(codigo) == -1) {
            System.out.println("## Não foi possível mostrar a detalhação do Carro ##");
        } else {            
            procurarCodigoCarro(codigo);            
            System.out.println("## APRESENTAÇÃO ##");
            System.out.println("Modelo: " + procurarCodigoCarro(codigo).getModelo());
            System.out.println("Cor: " + procurarCodigoCarro(codigo).getCor());
            System.out.println("Ano " + procurarCodigoCarro(codigo).getAno() );
            System.out.println("Preço: " + procurarCodigoCarro(codigo).getPreço());
            System.out.println("-------------------");
        }
    }

    @Override
    public void testeDrive() {
        System.out.println("Fazer teste drive....");
    }

}
