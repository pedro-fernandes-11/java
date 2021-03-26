
package conceitopolimorfismo;

public class Mamifero extends Animal{
    protected String corPelo;    

    @Override
    public String toString() {
        return "Mamifero{" + "idade="+this.idade+", peso="+this.peso+", membros="+this.membros+"corPelo=" + this.corPelo + '}';
    }
    
    
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("mamífero andando");
    }

    @Override
    public void alimentar() {
        System.out.println("mamífero mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("(som de mamífero)");
    }
}
