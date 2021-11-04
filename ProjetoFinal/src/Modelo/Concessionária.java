package Modelo;

public class Concessionária {
    //Atributos da Concessionária
    protected Carro[] carros;
    protected int qtdCarros;
    protected Usuário usuario;
    
    
    //Método Construtor
    public Concessionária() {
        carros = new Carro[100];
        qtdCarros = 0;
    }
    
    
    //Métodos da Classe:    
   
    //Depósito na conta do Usuário
    public void depositarSaldo (Usuário user, double valor) {
        user.setSaldo(user.getSaldo() + valor);
        System.out.println("Valor depositado!");
    }

    //Procurar Carro - (retorna sua posição)
    public int procurarCarro(int codigo) {
        for (int i=0; i < qtdCarros; i = i + 1) {
            if (this.carros[i].getCodigo() == codigo) {
                return i;
            }
        }
        return -1;
    }
    
    //Procurar Carro - (retorna o Carro)
    public Carro procurarCodigoCarro(int codigo) {
        for (int i=0; i < qtdCarros; i = i + 1) {
            if (this.carros[i].getCodigo() == codigo) {
                return this.carros[i];
            }            
        }
        return null;
    }
    
    //Exibir todos os carros
    public void exibirCarros() {
       for (int i=0; i < qtdCarros; i = i + 1 ) {
           System.out.println(i + "º Carro: " + this.carros[i]);
       }
    }
    
    //Adicionar um carro ao Catálogo
    public void adicionarCarro(Carro carro) {
        if (carro == null || this.qtdCarros == carros.length) {
            System.out.println("**Não foi possível adicionar!**");
        } else {
            this.carros[qtdCarros] = carro;            
            qtdCarros = qtdCarros + 1;
            System.out.println("## Carro adicionado! ##");
        }
    }
    
    //Remover um carro do Catálogo
    public void removerCarro(Carro carro) {
        if (carro == null || procurarCarro(carro.getCodigo()) == -1) {
            System.out.println("** Não foi possível remover **");
        } else {
            this.carros[qtdCarros] = carro;
            this.qtdCarros = this.qtdCarros - 1;
            System.out.println("## Carro retirado! ##");
        }
    }    
   
}