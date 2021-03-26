
package polimorfismosobrecarga;

public class Cachorro {
    public void reagir(String frase){
        if(frase == "Agradável"){
            System.out.println("latir");
        }else if(frase == "Xingando"){
            System.out.println("rosnar");
        }
    }
    
    public void reagir(int hora, int minuto){
        if(hora < 12){
            System.out.println("abanar");
        }else if(hora > 18){
            System.out.println("ignorar");
        }else{
            System.out.println("latir e abanar");
        }
    }
    
    public void reagir(boolean dono){
        if(dono){
            System.out.println("abanar");
        }else{
            System.out.println("rosnar");
        }
    }
    
    public void reagir(float peso, int idade){
        if(idade < 5){
            if(peso < 10){
                System.out.println("abanar");
            }else{
                System.out.println("latir");
            }
        }else{
            if(peso < 10){
                System.out.println("rosnar");
            }else{
                System.out.println("ignorar");
            }
        }
    }
}
