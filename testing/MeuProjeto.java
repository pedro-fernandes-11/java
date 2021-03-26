package meuprojeto;

public class MeuProjeto {

    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.setDono("Marcos");
        conta1.abrirConta("CC");
        System.out.println(conta1.getSaldo());
        conta1.depositar(1000);
        conta1.pagarMensal();
        System.out.println(conta1.getSaldo());
        conta1.fecharConta();
        conta1.sacar(1038);
        conta1.fecharConta();
        System.out.println(conta1.getStatus());
        
        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(8);
        conta2.abrirConta("CP");
        System.out.println(conta2.getSaldo());
        conta2.pagarMensal();
        conta2.pagarMensal();
        System.out.println(conta2.getSaldo());
        
        conta1.status();
        conta2.status();
    }
    
}
