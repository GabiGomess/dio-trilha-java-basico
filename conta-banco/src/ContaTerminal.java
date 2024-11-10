import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite a agência: ");
        String agenciaConta = scanner.next();

        System.out.println("Por favor, digite a conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo: ");
        double saldoConta = scanner.nextDouble();

        System.out.println(
            "Olá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + 
            ", conta " + numeroConta + 
            " e seu saldo R$" + saldoConta + 
            " já está disponível para saque."
        );
    }
}
