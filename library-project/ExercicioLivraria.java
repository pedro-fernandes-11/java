package exerciciolivraria;
public class ExercicioLivraria {
    public static void main(String[] args) {
        Pessoa pessoas[] = new Pessoa[10];
        pessoas[0] = new Pessoa("Joao", 20, "Masculino");
        pessoas[0].fazerAniver();
        pessoas[0].dadosPessoa();
        
        Livro livros[] = new Livro[10];
        livros[0] = new Livro("Harry Potter", "JK Rowling", 489, pessoas[0]);
        livros[0].detalhes();
        livros[0].abrir();
        
        livros[0].folhear();
        livros[0].detalhes();
    }
}
