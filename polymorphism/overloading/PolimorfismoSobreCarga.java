
package polimorfismosobrecarga;

public class PolimorfismoSobreCarga {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.reagir(true);
        dog.reagir(false);
        dog.reagir(8.5f, 8);
        dog.reagir(21, 0);
        dog.reagir(9, 30);
        dog.reagir("Agradável");
    }
    
}
