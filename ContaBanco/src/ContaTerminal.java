import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        //TODO: Exibir as mensagens para o nosso usuário
        //TODO: Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o seu nome completo:");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o numero da agência:");
        agencia = scanner.next();
        System.out.println("Por favor, digite o numero da conta:");
        numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o saldo:");
        saldo = scanner.nextDouble();

        //TODO: Exibir a mensagem conta criada
        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo "+ String.format("%.2f", saldo) + " já está disponível para saque.");
    }
}
