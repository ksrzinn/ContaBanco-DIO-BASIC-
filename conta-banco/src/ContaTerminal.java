import java.util.Scanner;

public class ContaTerminal {
    final String AGENCIA = "159";
    String conta = "";
    String nome = "";
    double saldo = 0.0;
    Scanner scanner = new Scanner(System.in);

    public void sacar(double valor){
        if (valor <= saldo){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso! Valor atual: " + this.saldo);
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println( "Deposito realizado com sucesso! Valor atual: " + this.saldo);

    }

    public void mostrarConta(){
        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ AGENCIA +", conta "+ conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }

    public void criarConta(){
        System.out.println("Digite o nome do titular da conta: ");
        this.nome = scanner.nextLine();

        System.out.println("Digite o numero da conta desejado: ");
        this.conta = scanner.nextLine();

        System.out.println("Digite o valor do primeiro deposito: ");
        this.saldo = scanner.nextDouble();

        this.mostrarConta();
    }

    public static void main(String[] args) throws Exception {
    }
}


//TO DO: import and use scanner, exibir mensagens