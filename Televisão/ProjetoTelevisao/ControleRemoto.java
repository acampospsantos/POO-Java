package rascunhopoo3;

public class ControleRemoto implements Controlador {

    //Atributos (Encapsulados)
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Método Construtor
    public ControleRemoto() {
        this.volume = 0;
        this.ligado = false;
        this.tocando = false;
    }

    //Métodos Acessores e Modificadores
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public boolean getTocando() {
        return this.tocando;
    }

    //Métodos da CLASSE
    @Override
    public void ligar() {
        if (this.getLigado() == false) {
            this.setLigado(true);
            this.setVolume(30);
            System.out.println("## TV LIGADA ##");
        } else {
            System.out.println("## TV JÁ ESTÁ LIGADA ##");
        }
    }

    @Override
    public void desligar() {
        if (this.getLigado() == true) {
            this.setLigado(false);
            System.out.println("## TV DESLIGADA ##");
        } else {
            System.out.println("##TV JÁ ESTÁ DESLIGADA ##");
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println("");
        System.out.println("----- MENU -----");
        System.out.println("LIGADO: " + this.getLigado());
        System.out.println("VOLUME: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i = i + 1) {
            System.out.print("|");            
        }
        System.out.println("");
        System.out.println("Reproduzindo algo: " + this.getTocando());
        System.out.println("---------------");
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("## FECHOU MENU ##");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() == true) {
            if (this.getVolume() < 100) {
                this.setVolume(this.getVolume() + 1);
                System.out.println("Volume: " + this.getVolume());
            } else {
                System.out.println("## VOLUME NO MÁXIMO ##");
                System.out.println("Volume: " + this.getVolume());
            }
        } else {
            System.out.println("## NÃO FOI POSSÍVEL AUMENTAR VOLUME ##");
            System.out.println("## TV DESLIGADA ##");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() == true) {
            if (this.getVolume() > 0) {
                this.setVolume(this.getVolume() - 1);
                System.out.println("Volume: " + this.getVolume());
            } else {
                System.out.println("## VOLUME NO MÍNIMO");
                System.out.println("Volume: " + this.getVolume());
            }
        } else {
            System.out.println("## NÃO FOI POSSÍVEL ABAIXAR VOLUME ##");
            System.out.println("## TV DESLIGADA ##");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() == true) {
            if (this.getVolume() > 0) {
                this.setVolume(0);
                System.out.println("## TV NO MUDO ##");
            } else {
                System.out.println("## TV JÁ ESTÁ MUDA ##");
            }          
        } else {
            System.out.println("## NÃO FOI POSSÍVEL ##");
            System.out.println("## TV DESLIGADA ##");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() == true) {
            if (this.getVolume() == 0) {
                this.setVolume(30);
                System.out.println("## MUDO DESLIGADO ##");
            } else {
                System.out.println("##TV JÁ ESTÁ COM SOM ##");
            }
        } else {
            System.out.println("## NÃO FOI POSSÍVEL ##");
            System.out.println("## TV DESLIGADA ##");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() == true) {
            if (this.getTocando() == false) {
                this.setTocando(true);
                System.out.println("## PLAY ##");
            } else {
                System.out.println("## PLAY JÁ EM EXECUÇÃO ##");
            }
        } else {
            System.out.println("## NÃO FOI POSSÍVEL ##");
            System.out.println("## TV DESLIGADA ##");

        }

    }

    @Override
    public void pause() {
         if (this.getLigado() == true) {
            if (this.getTocando() == true) {
                this.setTocando(false);
                System.out.println("## PAUSE ##");
            } else {
                System.out.println("## TV JÁ PAUSADA ##");
            }
        } else {
            System.out.println("## NÃO FOI POSSÍVEL ##");
            System.out.println("## TV DESLIGADA ##");
        }
    }
}
