package exerciciolivraria;
public class Pessoa {
    //Atributos (privados)
    private String nome;
    private int idade;
    private String sexo;
    
    //======== Método construtor ========
    public Pessoa(String n, int i, String s){
        setNome(n);
        setIdade(i);
        setSexo(s);
    }
    
    //======== Método público ==========
    public void fazerAniver(){
        this.setIdade(1 + getIdade());
    }
    public void dadosPessoa(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Sexo: "+this.getSexo());
    }
    
    //======== Métodos acessores e modificadores ========

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}