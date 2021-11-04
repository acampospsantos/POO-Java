package rascunhopoo.pkg2;

public class RelacoesClientes {
    
    //Atributos (Encapsulados)
    private ContaBanco cliente1;
    private ContaBanco cliente2;
    
           
    //Métodos da Classe
    public boolean validacaoCliente(ContaBanco fulano) {
        if (fulano.getStatus() == false) {
            return false;
        } else { //fulano.getStatus() == true
            return true;
        }
    }
    
    //cliente1 recebe a Transferência
    //cliente2 realiza a Transferência
    public void transferencia(ContaBanco cliente1, ContaBanco cliente2, double valorTransf) {
        if ((validacaoCliente(cliente1) == true) && (validacaoCliente(cliente2) == true)) {
            cliente1.setSaldo(cliente1.getSaldo() + valorTransf);
            cliente2.setSaldo(cliente2.getSaldo() - valorTransf);
            System.out.println("## TRANSFERÊNCIA REALIZADA ##");
            status(cliente1, cliente2);
        } else {
            System.out.println("## OPERAÇÃO INVÁLIDA ##");
            System.out.println("## CONTA(S) INVÁLIDA(S) ##");
        }
    }
    
    public void status(ContaBanco cliente1, ContaBanco cliente2) {
        cliente1.statusGeral();
        cliente2.statusGeral();
    }
    
}
