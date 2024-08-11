import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Cria uma instância da classe Scanner que lê a entrada do terminal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da Conta! ");
        int numeroConta = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência! ");
        String agencia = scanner.nextLine();

        // Chama a próxima linha, para que não ocorra erro no nome do cliente caso ele digite o nome completo.
        scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente! ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta! ");
        double saldoCliente = scanner.nextDouble();

        // Fecha o scanner para liberar os recursos
        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                           ", conta " + numeroConta + " e seu saldo de R$" + saldoCliente + " já está disponível para saque.");
    }
}
