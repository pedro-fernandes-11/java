
package conceitopolimorfismo;

public class Reptil extends Animal{
    protected String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    @Override
    public void locomover() {
        System.out.println("reptil rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("reptil comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("(som de reptil)");
    }
    
}
