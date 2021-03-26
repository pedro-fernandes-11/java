
package conceitopolimorfismo;

public class Cachorro extends Mamifero{
    @Override
    public void emitirSom(){
        System.out.println("latindo");
    }
    public void enterrarOsso(){
        System.out.println("enterrando osso");
    }
    
    public void abanarRabo(){
        System.out.println("abanando rabo");
    }
}
