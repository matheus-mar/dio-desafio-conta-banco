import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.print("Informe o número da agência: ");
        agencia = sc.next();

        System.out.print("Informe o número da conta: ");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Informe o nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.print("Informe o saldo inicial da conta: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
