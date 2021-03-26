package projetouec;

public class Lutador implements LutadorInterface{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Método construtor
    public Lutador(String n, String na, int i, float alt, float pe, int vit, int de, int emp){
        this.nome = n;
        this.nacionalidade = na;
        this.idade = i;
        this.altura = alt;
        this.peso = pe;
        this.vitorias = vit;
        this.derrotas = de;
        this.empates = emp;
    }
    
    public void apresentar(){
        System.out.println("Seu nome é "+this.nome);
        System.out.println("Ele é de "+this.nacionalidade);
        System.out.println("Ele tem "+this.idade+" anos e "+this.peso+" de peso!");
        System.out.println("Medindo "+this.altura);
        System.out.println("Categoria "+this.getCategoria());
        System.out.println("Possuí "+this.vitorias+" vitórias, "+this.derrotas+" derrotas e "+this.empates+" empates!");
    }
    public void status(){
        System.out.println("=====STATUS=====");
        System.out.print(this.getNome());
        System.out.println(" é um "+this.getCategoria());
        System.out.print("| V: "+this.getVitorias());
        System.out.print(" | D: "+this.getDerrotas());
        System.out.println(" | E: "+this.getEmpates()+" |");
        System.out.println("================");
    }
    public void ganharLuta(){
        this.vitorias++;
    }
    public void perderLuta(){
        this.derrotas++;
    }
    public void empatarLuta(){
        this.empates++;
    }
    
    //Métodos acessores e modificadores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        this.setCategoria();
        return categoria;
    }

    public void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Peso leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Peso médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Peso pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
