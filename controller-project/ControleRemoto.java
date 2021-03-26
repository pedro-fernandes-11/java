package projetocontrole;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Metodo construtor
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    // Metodos Acessores e modificadores
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //Metodos abstratos
    public void ligar() {
        this.setLigado(true);
    }

    public void desligar() {
        this.setLigado(false);
    }
    
    public void abrirMenu() {
        System.out.println("Está ligado? "+this.ligado);
        System.out.println("Está tocando? "+this.tocando);
        System.out.print("Volume: ");
        
        for(int i = 1;i <= this.volume;i+=10){
            System.out.print("|");
        }
        System.out.println("\n");
    }

    public void fecharMenu() {
        System.out.println("Fechando o menu...");
    }

    public void maisVolume() {
        if(this.ligado == true){
            if(this.volume < 100){
                this.volume++;
            }
        }else{
            System.out.println("TV desligada");
        }
    }

    public void menosVolume() {
        if(this.ligado == true){
            if(this.volume > 0){
                this.volume--;
            }
        }else{
            System.out.println("TV desligada");
        }
    }

    public void ligarMudo() {
        if(this.ligado == true){
            if(this.volume > 0){
                this.volume = 0;
            }else{
                System.out.println("Já está mudo");
            }
        }else{
            System.out.println("TV desligada");
        }
    }

    public void desligarMudo() {
        if(this.ligado == true){
            this.volume = 50;
        }else{
            System.out.println("TV desligada");
        }
    }

    public void play() {
        if(this.ligado == true){
            if(this.tocando == false){
                this.tocando = true;
            }else{
                System.out.println("Já esta tocando");
            }
        }else{
            System.out.println("TV desligada");
        }
    }

    public void pause() {
        if(this.ligado == true){
            if(this.tocando == true){
                this.tocando = false;
            }else{
                System.out.println("Já esta pausado");
            }
        }else{
            System.out.println("TV desligada");
        }
    }
    
}
