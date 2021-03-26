package exerciciolivraria;

import java.util.Random;

public final class Livro implements Publicacao{
    //Atributos (privados)
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //======== Método construtor =========
    public Livro(String t, String aut, int totPg, Pessoa l){
        this.setTitulo(t);
        this.setAutor(aut);
        this.setTotPaginas(totPg);
        this.setLeitor(l);
        this.setPagAtual(0);
        this.setAberto(false);
    }
    
    //======== Método público =========
    public void detalhes(){
        System.out.println("=== DETALHES DO LIVRO ===");
        System.out.println("Título: "+this.getTitulo());
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Total de páginas: "+this.getTotPaginas());
        System.out.println("Leitor atual: "+this.leitor.getNome());
        System.out.println("Página atual: "+this.getPagAtual());
        System.out.println("O livro está aberto? "+this.getAberto());
        System.out.println("=========================");
    }
    
    //======== Métodos acessores e modificadores =======
    
    public String getTitulo() {    
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {    
        this.leitor = leitor;
    }

    
    //======== Métodos interface =======
    
    @Override
    public void abrir() {
        if(this.getAberto()){
            System.out.println("O livro já se encontra aberto!");
        }else{
            System.out.println("Abrindo livro...");
            this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if(this.getAberto()){
            System.out.println("Fechando o livro...");
            this.setAberto(false);
        }else{
            System.out.println("O livro já está fechado!");
        }
    }

    @Override
    public void folhear() {
        if(this.getAberto()){
            Random aleatorio = new Random();
            int pgAleat = aleatorio.nextInt(this.getTotPaginas() - 1);
            this.setPagAtual(pgAleat);
            System.out.println("Folheado, página atual: "+this.getPagAtual());
        }else{
            System.out.println("O livro está fechado");
        }
    }

    @Override
    public void avancarPag() {
        if(this.getAberto()){
            this.setPagAtual(1 + this.getPagAtual());
            System.out.println("Página avançada! Página atual: "+this.getPagAtual());
        }else{
            System.out.println("O livro está fechado");
        }
    }

    @Override
    public void voltarPag() {
        if(this.getAberto()){
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("Página voltada! Página atual: "+this.getPagAtual());
        }else{
            System.out.println("O livro está fechado");
        }
    }
    
}