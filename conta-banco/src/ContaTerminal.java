import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
       
        int numero;
       String agencia;
       String nomeCliente;
       Double saldo = 237.48;

       try (Scanner entradaUsuario = new Scanner(System.in)) {
        System.out.println("Olá, bem vindo ao Alra App, seu app do Alra Bank!" );
           System.out.println("Digite seu nome para iniciar o seu login. Após cada dado informado aperte 'Enter' para confirmar"); 
           nomeCliente = entradaUsuario.nextLine();      
           System.out.println("Por favor, digite o número da sua Agência: ");
           agencia = entradaUsuario.nextLine();
           System.out.println("Quase lá! Agora, digite o número de sua conta: ");
           numero = entradaUsuario.nextInt();
    }

       System.out.println("Olá " + nomeCliente + ", obrigado por utilizar nosso app.");
       System.out.println(" Sua agência é a " + agencia + ", conta de número " + numero + ", e seu saldo de R$" + saldo + " já está disponível para saque.");

    }
}
