
package projetocev;
public class ProjetoCEV {

    public static void main(String[] args) {
        Video video[] = new Video[3];
        video[0] = new Video("Primeiro video do canal");
        video[1] = new Video("Segundo video do canal");
        video[2] = new Video("Terceiro video do canal");
        
        Gafanhoto gafanhoto[] = new Gafanhoto[2];
        gafanhoto[0] = new Gafanhoto("Marcos", 9, "M", "marquinhos");
        gafanhoto[1] = new Gafanhoto("Pedro", 16, "M", "pouzadap");
        
        Visualizacao view1 = new Visualizacao(gafanhoto[0], video[2]);
        view1.avaliar(35.f);
        System.out.println(view1.toString());
        video[2].detalhesDoVideo();
        gafanhoto[0].dadosGafanhoto();
        
    }
    
}
