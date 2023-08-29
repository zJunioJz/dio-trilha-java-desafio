import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        System.out.print("Por favor, digite o numero da Conta: ");
        int numeroConta = sc.nextInt();

        sc.nextLine();

        System.out.print("\nPor favor, Informe o numero da Agência: ");
        String numeroAgencia = sc.nextLine();

        System.out.print("\nPor favor, Informe o seu Nome: ");
        String nome = sc.nextLine();

        System.out.print("\nPor favor, Informe o seu Saldo: ");
        double saldo = sc.nextDouble();

        sc.close();

        // Exibir a mensagem da conta criada
        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo
                + " já está disponível para saque.");
    }

}