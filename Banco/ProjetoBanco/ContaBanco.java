package rascunhopoo.pkg2;

public class ContaBanco {

    //Atributos da Classe (encapsulados)
    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //Método Construtor da Classe
    public ContaBanco(String tipo, String dono) {
        //Número da conta - inicialmente 0
        this.numConta = 0;
        //Tipo de Conta
        if (tipo.equals("CC")) {
            this.tipo = "CC";
        } else if (tipo.equals("CP")) {
            this.tipo = "CP";
        } else {
            System.out.println("## Tipo de Conta inválido ##");
        }
        //Nome do dono
        if (!dono.equals("")) {
            this.dono = dono;
        } else {
            System.out.println("## NOME INVÁLIDO ##");
        }
        //Saldo inicialmente 0        
        this.saldo = 0;
        //Conta inicialmente fechada
        this.status = false;
    }

    //Métodos Acessores e Modificadores
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono() {
        return this.dono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }

    //$$$ Métodos da Conta Banco $$$$$$
    public void abrirConta(int numCONTA) {        
        if (this.tipo == "CC") {
            this.setStatus(true);
            this.setNumConta(numCONTA);
            this.setSaldo(this.getSaldo() + 50);
            System.out.println("## Conta CC aberta!! ##");
        } else if (this.tipo == "CP") {
            this.setStatus(true);
            this.setNumConta(numCONTA);
            this.setSaldo(this.getSaldo() + 150);
            System.out.println("## Conta CP aberta!! ##");
        }
    }

    public void fecharConta() {
        if (this.getSaldo() == 0) {
            this.setStatus(false);
            this.setNumConta(0);
            System.out.println("##Conta Fechada ##");
        } else {
            System.out.println("## Não foi possível fechar a conta ##");
            System.out.println("Saldo na conta: R$" + this.getSaldo());
        }
    }

    public void depositar(double deposito) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("## Depósito realizado ##");
        } else { //this.getStatus() == false
            System.out.println("## Não foi possível realizar depósito ##");
            System.out.println("## Conta está fechada ##");
        }
    }

    public void sacar(double saque) {
        if (this.getStatus() == true) {
            if (this.getSaldo() >= saque) {
                this.setSaldo(this.getSaldo() - saque);
                System.out.println("## Saque realizado ##");
            } else { //this.getSaldo() < saque
                System.out.println("## Saldo insuficiente p/ saque ##");
            }
        } else {
            System.out.println("## NÃO FOI POSSÍVEL REALIZAR O SAQUE ##");
            System.out.println("## Conta está fechada ##");
        }
    }

    public void pagarMensal() {
        if (this.getStatus() == true) {
            if (this.getTipo() == "CC") {
                this.setSaldo(this.getSaldo() - 12);
                System.out.println("## Mensalidade cobrada ##");
            } else if (this.getTipo() == "CP") {
                this.setSaldo(this.getSaldo() - 20);
                System.out.println("## Mensalidade cobrada ##");
            }
        } else {
            System.out.println("## CONTA FECHADA ##");
            System.out.println("## NÃO FOI POSSÍVEL COBRAR MENSALIDADE ##");
        }
    }

    public void statusGeral() {
        System.out.println("");
        System.out.println("------ STATUS ------");
        System.out.println("Nome do Titular: " + this.getDono());
        System.out.println("Tipo da Conta: " + this.getTipo());
        System.out.println("Número da Conta: " + this.getNumConta());
        System.out.println("Saldo do Titular: R$" + this.getSaldo());
        System.out.println("Status da Conta: " + this.getStatus());
        System.out.println("-------------------");
        System.out.println("");
        System.out.println("");
    }

}
