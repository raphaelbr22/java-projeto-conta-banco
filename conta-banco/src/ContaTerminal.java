import java.util.Scanner;

public class ContaTerminal {
    /**
     * <h1>Conta Terminal</h1>
     * Projeto Conta Terminal recebe os valores de entrada e retorna um texto simples com valores pré determinados
     * <p>
     * <b>Nota:</b> Projeto realizado para estudos e entrega do desafio do bootcamp "Formação Java Developer", 
     * na plataforma DIO.
     * 
     * @author Raphael Barbosa Rocha
     * @version 1.0
     * @since 01/09/2022
     * 
     * @param numero esta é a variável de entrada para definir o número da conta
     * @param agencia esta é a variável de entrada para definir o número da agência
     * @param nomeCliente esta é a variável de entrada que vai armazenar o nome do cliente
     * @param numero esta é a variável pré-definida com valor fixo e didatico para definir o saldo em conta
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
