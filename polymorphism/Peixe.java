
package conceitopolimorfismo;

public class Peixe extends Animal{
    protected String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    public void soltarBolha(){
        System.out.println("bolhas");
    }
    @Override
    public void locomover() {
        System.out.println("peixe nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("peixe comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("peixe não emite som");
    }
    
}
