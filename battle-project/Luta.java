package projetouec;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1.getNome() != l2.getNome()){
            System.out.println("Luta marcada!");
            this.desafiante = l1;
            this.desafiado = l2;
            this.aprovada = true;
        }else{
            System.out.println("A luta não pôde ser marcada");  
            this.aprovada = false;
            this.desafiante = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada == true){
            System.out.println("=== DESAFIADO ===");
            this.desafiado.apresentar();
            System.out.println("=== DESAFIANTE ===");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            switch(vencedor){
                case 0:
                    System.out.println("============== Luta empatou ==============");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    this.desafiante.status();
                    this.desafiado.status();
                    break;
                case 1:
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    System.out.println("============== Desafiante ganhou ============== ("+this.desafiante.getNome()+")");
                    this.desafiante.status();
                    this.desafiado.status();
                    break;
                case 2:
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("============== Desafiado ganhou ============== ("+this.desafiado.getNome()+")");
                    this.desafiado.status();
                    this.desafiante.status();
                    break;        
            }
            
                    
        }else{
            System.out.println("A luta não foi aprovada");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
