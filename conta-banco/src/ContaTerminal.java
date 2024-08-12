import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale localeBR = Locale.of("pt", "BR");
        Scanner scanner = new Scanner(System.in).useLocale(localeBR);
        ;
        try {
            System.out.println(
                    "Olá, para iniciar o processo de criação de sua conta, favor responda as seguintes perguntas:\n");
            System.out.println("1 - Por gentileza, me informe o seu nome.");
            String nome = scanner.nextLine();
            System.out.println("2 - Com quanto de saldo você pretende abrir sua conta?");
            double saldo = scanner.nextDouble();
            System.out.println("3 - Por favor, digite o número da Agência!");
            int agencia = scanner.nextInt();
            System.out.println("4 - Agora, digite o número da sua Conta!");
            String conta = scanner.next();

            scanner.close();
            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                    + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
        } catch (InputMismatchException e) {
            System.out.println("Ocorreu um erro de entrada inválida. Possivelmente você tentou digitar uma valor de saldo com '.'. Neste código estamos usando a localização brasileira, portanto tente separar com ','");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e);
        }

    }
}
