package rascunhopoo;

public class Caneta {
    //Atributos
    private String modelo;
    private String cor;
    private double ponta;
    private int carga;
    private boolean tampada;
    
    //Método Construtor
    public Caneta(String modelo, String cor, double ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }
    
    //Metodos Modificadores(Setter's) e Acessores(getter's)
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }
    
    public void setPonta(double ponta) {
        this.ponta = ponta;
    }
    public double getPonta() {
        return this.ponta;
    }
    
    public void setCarga(int carga) {
        this.carga = carga;
    }
    public int getCarga() {
        return this.carga;
    }
    
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    public boolean getTampada() {
        return this.tampada;
    }
    
    
    //Métodos da Classe 'Caneta'
    public void rabiscar() {
        if (this.getTampada() == false && this.getCarga() > 0) {
            this.setCarga(this.getCarga() - 1);
            System.out.println("Rabiscou");            
        } else {
            System.out.println("Falhou");
        }
    }
    
    public void tampar() {
        if (this.getTampada() == false) {
            this.setTampada(true);
            System.out.println("Tampou a caneta");
        } else {
            System.out.println("Já está tampada");
        }
    }
    
    public void destampar() {
        if (this.getTampada() == true) {
            this.setTampada(false);
            System.out.println("Destampou a caneta");
        } else {
            System.out.println("Já está destampada");
        }
    }
    
    public void status() {
        System.out.println("");
        System.out.println("------ STATUS ------");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Tampada: " + this.getTampada());
        System.out.println("----------------------");
    }
    
    
}
