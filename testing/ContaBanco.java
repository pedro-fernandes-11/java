package meuprojeto;

public class ContaBanco {
    public int numConta = 0;
    protected String tipo = "Indefinido";
    private String dono = "Indefinido";
    private float saldo;
    private boolean status;
    
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    
    public void abrirConta(String tipo_p){

        if("CC" == tipo_p){
            this.saldo += 50;
            this.status = true;
            this.tipo = "CC";
            System.out.println("Conta aberta");
        }else if(tipo_p == "CP"){
            this.saldo += 150;
            this.status = true;
            this.tipo = "CP";
            System.out.println("Conta aberta");
        }else{
            System.out.println("Erro! Tipo de conta irreconhecível");
        }
        
    }
    
    public void fecharConta(){
        
    if(this.status == true){
        
        if(this.saldo < 0){
            System.out.println("Erro! Pague o que deve!");
        }else if(this.saldo > 0){
            System.out.println("Erro! Saque o que tem!");
        }else{
            this.status = false;
            System.out.println("Conta fechada!");
        }
        
    }else{
        System.out.println("Conta já se encontra fechada!");
    }
        
    }
    
    public void depositar(int valor_d){
        if(this.status == true){
            this.saldo += valor_d;
        }else{
            System.out.println("A conta está fechada!");
        }
    }
    
    public void sacar(int valor_s){
        if(this.status == true){
            
            if(valor_s <= this.saldo){
                this.saldo -= valor_s;
            }else{
                System.out.println("Valor mais alto que o saldo!");
            }
            
        }else{
            System.out.println("A conta está fechada!");
        }
    }
    
    public void pagarMensal(){
        if(this.status == true){
            
            if(this.tipo == "CC"){
                this.saldo -= 12;
            }else if(this.tipo == "CP"){
                this.saldo -= 20;
            }else{
                System.out.println("Erro! Tipo de conta irreconhecível");
            }
            
        }else{
            System.out.println("A conta está fechada!");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void status(){
        System.out.println("======INFORMAÇÕES DA CONTA======");
        System.out.println("Número da conta: "+this.numConta);
        System.out.println("Nome do dono: "+this.dono);
        
        if(this.tipo == "CC"){
            System.out.println("Tipo da conta: Conta Corrente");
        }else{
            System.out.println("Tipo da conta: Conta Poupança");
        }
        
        System.out.println("Saldo da conta: "+this.saldo);
         if(this.status == true){
             System.out.println("A conta se encontra aberta no momento");
         }else{
             System.out.println("A conta se encontra fechada no momento");
         }
         System.out.println("===============================");
    }
    
}
