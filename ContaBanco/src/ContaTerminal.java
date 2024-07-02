//TO DO: Conhecer e importar a classe Scanner
import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o usuário e obter os valores
        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome: "); 
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome: "); 
        String sobrenome = scanner.next();

        String nomeCliente = nome + " "+ sobrenome;
        nomeCliente.toUpperCase();

        System.out.println("Por favor, digite o saldo da conta: ");
        Double saldo = scanner.nextDouble();

        //Exibir a mensagem da conta criada
        System.out.println(
        "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco sua agência é "
         +agencia+ ", conta " + numero +
         " e seu saldo " + saldo +
         " já está disponível para saque."
         );

    }
}
