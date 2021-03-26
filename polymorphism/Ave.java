
package conceitopolimorfismo;

public class Ave extends Animal{
    protected String corPena;
    
    public void fazerNinho(){
        System.out.println("ninhos");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
        
    @Override
    public void locomover() {
        System.out.println("ave voando");
    }

    @Override
    public void alimentar() {
        System.out.println("ave comendo minhoca");
    }

    @Override
    public void emitirSom() {
        System.out.println("(som de ave)");
    }
    
}
