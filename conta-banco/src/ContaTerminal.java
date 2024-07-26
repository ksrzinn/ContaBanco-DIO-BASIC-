import java.util.Scanner;

public class ContaTerminal {
    final String AGENCIA = "159";
    String conta = "";
    String nome = "";
    double saldo = 0.0;


    public void mostrarConta(){
        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ AGENCIA +", conta "+ conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }

    public void criarConta(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do titular da conta: ");
        this.nome = scanner.nextLine();

        System.out.println("Digite o numero da conta desejado: ");
        this.conta = scanner.nextLine();

        System.out.println("Digite o valor do primeiro deposito: ");
        this.saldo = scanner.nextDouble();

        this.mostrarConta();
    }

    public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();
        conta.criarConta();
    }
}


//TO DO: import and use scanner, exibir mensagens