import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String nomeCliente = "Ana Maria";
        double saldo = 1025.3;  
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String saldoFormatado = formatter.format(saldo);


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o numero de sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Informe o numero da agencia: ");
        String agencia = scanner.next();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque.\n", nomeCliente, agencia, conta, saldoFormatado);

        scanner.close();
    }
}
