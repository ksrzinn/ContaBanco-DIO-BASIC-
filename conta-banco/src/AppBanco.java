import java.util.Scanner;

public class AppBanco {
    Scanner scanner = new Scanner(System.in);
    ContaTerminal conta = null;
    
    public void menu(int escolha){
        System.out.println( "=== SYS BANK ===\n\n1 - Cadastrar Conta\n2 - Fazer saque\n3 - Realizar deposito\n0 - Sair\n\n");
        
        switch (escolha) {
            case 1:
                this.conta = new ContaTerminal();
                this.conta.criarConta();
                break;
            
            case 2:
                if(conta != null){
                    System.out.println("Valor do saque: ");
                    double valor = scanner.nextDouble();
                    conta.sacar(valor);
                }
                else{
                    System.out.println( "Nao ha conta para realizar saque");
                }
                break;
            case 3:
                if(conta != null){
                    System.out.println( "Valor do deposito: ");
                    double valor = scanner.nextDouble();
                    conta.depositar(valor);
                }
                else{
                    System.out.println( "Nao ha conta para realizar deposito!");
                }
                break;

            case 0:
                System.out.println( "Saindo do sistema");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppBanco app = new AppBanco();
        int escolha = -1;
        while(escolha != 0){
            app.menu(escolha);
            System.out.println("Escolha:");
            escolha = scanner.nextInt();
        }

    }
}
