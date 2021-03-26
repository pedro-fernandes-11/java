
package projetocev;

public abstract class Pessoa {
    // Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;
    
    // Método construtor

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }
    
    
    // Métodos protegidos
    protected void ganharExp(){
        
    }
    
    // Métodos acessores e modificadores
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

    public float setExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
    
    
    
}
