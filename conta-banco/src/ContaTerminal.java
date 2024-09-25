
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Conta myConta = new Conta();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do Cliente !");
        myConta.setNomeCliente(scanner.nextLine());

        System.out.println("Por favor, digite o número da Agência !");
        myConta.setAgencia(scanner.next());

        System.out.println("Por favor, digite o número da Conta !");
        myConta.setNumero(scanner.nextInt());

        System.out.println("Por favor, digite o Saldo !");
        myConta.setSaldo(scanner.nextDouble());

        myConta.getToString();
    }
}
