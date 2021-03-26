
package projetocev;

public class Video implements AcoesVideo{
    // Atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    // Método construtor
    public Video(String titulo){
        this.avaliacao = 1;
        this.titulo = titulo;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    // Métodos acessores e modificadores
    public String getTitulo() {    
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }
    
    public void setReproduzindo(boolean reproduzindo) {    
        this.reproduzindo = reproduzindo;
    }
    
    // Métodos da interface
    @Override
    public void play() {
        if(this.reproduzindo){
            System.out.println("O vídeo já está sendo reproduzido");
        }else{
            this.reproduzindo = true;
            System.out.println("Video em reprodução...");
        }
    }

    @Override
    public void pause() {
        if(!this.reproduzindo){
            System.out.println("O vídeo já está pausado");
        }else{
            this.reproduzindo = false;
            System.out.println("Vídeo pausado.");
        }
    }

    @Override
    public void like() {
        this.curtidas++;
    }
    
    public void detalhesDoVideo() {
        System.out.println("===== DETALHES DO VIDEO =====");
        System.out.println("Título do vídeo: "+this.titulo);
        System.out.println("Avaliação do vídeo: "+this.avaliacao);
        System.out.println("O video tem "+this.curtidas+" curtidas.");
        System.out.println("O vídeo tem "+this.views+" visualizações.");
        if(this.reproduzindo){
            System.out.println("O vídeo está reproduzindo...");
        }else{
            System.out.println("O vídeo não está reproduzindo...");
        }
        System.out.println("============================");
    }
    
}
