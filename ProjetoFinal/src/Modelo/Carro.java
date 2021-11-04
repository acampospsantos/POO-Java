package Modelo;

//A Classe Carro vai implementar o Código dos Métodos Abstratos da Interface 
public final class Carro {
    //Atributos do Carro    
    private String modelo;
    private String cor;
    private int ano;
    private double preço;
    private int codigo;
        
    //Método Construtor
    public Carro(String modelo, String cor, int ano, double preço, int codigo) {        
        this.setModelo(modelo);
        this.setCor(cor);
        this.setAno(ano);
        this.setPreço(preço);
        this.setCodigo(codigo);
    }
    
    
    //Métodos Acessores   
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setCor(String cor) {
        this.cor = cor;        
    }
    public String getCor() {
        return this.cor;
    }
        
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return this.ano;
    }
    
    public void setPreço(double preço) {
        this.preço = preço;
    }
    public double getPreço() {
        return this.preço;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    } 
    public int getCodigo() {
        return this.codigo;
    }
    
}
    
    
    
 
   
    
    
    
    
