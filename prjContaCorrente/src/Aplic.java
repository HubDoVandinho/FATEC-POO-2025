
import java.util.Scanner;

/**
 * @author Vandinho aka Evandro 0030482411017
 */
public class Aplic {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcao, numConta;
        double valorIn, valorOut;

        System.out.print("Digite o numero da conta: ");
        numConta = entrada.nextInt();
        ContaCorrente novaConta = new ContaCorrente(numConta, 0.0);

        do {
            System.out.println("\n-------------------");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.print("\nDigite a opcao: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("-------------------");
                System.out.println("\nConta: " + novaConta.getNumero());
                System.out.println("Saldo em conta: R$" + novaConta.getSaldo());

                do {
                    System.out.print("\nDigite o Valor para Depositar: R$");
                    valorIn = entrada.nextDouble();

                    if (valorIn > 0.0) {
                        novaConta.depositar(valorIn);
                        System.out.println("\nDeposito Realizado com sucesso.");
                        System.out.println("\nNovo saldo em conta: R$" + novaConta.getSaldo());
                        break;
                    } else {
                        System.out.println("\nValor invalido para deposito. Insira um valor maior que R$0.");
                    }
                } while (valorIn <= 0.0);

            } else if (opcao == 2) {
                System.out.println("-------------------");
                System.out.println("\nConta: " + novaConta.getNumero());
                System.out.println("Saldo em conta: R$" + novaConta.getSaldo());

                do {
                    if (novaConta.getSaldo() == 0.0) {
                        System.out.println("Nao a saldo em conta. Faca primeiro um deposito.");
                        break;
                    } else {
                        System.out.print("\nDigite o Valor para Sacar: R$");
                        valorOut = entrada.nextDouble();
                        if (valorOut <= 0.0) {
                            System.out.println("\nValor invalido para saque. Insira um valor maior que R$0.");
                        } else if (valorOut > (novaConta.getSaldo())) {
                            System.out.println("\nValor invalido para saque. Insira um valor maior que o saldo em conta.");
                        } else {
                            novaConta.sacar(valorOut);
                            System.out.println("\nSaque Realizado com sucesso.");
                            System.out.println("\nNovo saldo em conta: R$" + novaConta.getSaldo());
                            break;
                        }
                    }

                } while ((valorOut <= 0.0) || (valorOut > (novaConta.getSaldo())));

            } else if (opcao == 3) {
                System.out.println("-------------------");
                System.out.println("\nConta: " + novaConta.getNumero());
                System.out.println("Saldo em conta: R$" + novaConta.getSaldo());
            } else if (opcao == 4) {
                System.out.println("-------------------"); 
                System.out.println("\nEncerrando...\n");
                System.out.println("-------------------"); 
                break;
            } else {
                System.out.println("-------------------"); 
                System.out.println("\nOpcao invalida.");
            }

        } while (true);
    }

}

 

