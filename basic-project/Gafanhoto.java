
package projetocev;

public class Gafanhoto extends Pessoa{
    // Atributos
    private String login;
    private int totAssistido;
    
    // Método construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    // Métodos públicos
    public void viuMaisUm(){
        
    }
    
    // Métodos acessores e modificadores
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    public void dadosGafanhoto(){
        System.out.println("=== DETALHES DO GAFANHOTO ===");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("Login: "+this.login);
        System.out.println("Total de video assistidos: "+this.totAssistido);
        System.out.println("===========================");
    }
    
    
}
