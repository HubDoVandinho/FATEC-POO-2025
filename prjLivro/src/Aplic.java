
import java.util.Scanner;


/**
 *
 * @author 0030482411017
 */
public class Aplic {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int identLivro, dias, opcao;
        String titulo;
        boolean situacao;
        double valMultaDiaria;
        
        System.out.print("Digite o ID do livro: ");
        identLivro = entrada.nextInt();
        
        System.out.print("Digite o NOME do livro: ");
        titulo = entrada.next();
        
        System.out.print("Digite o Valor da Multa(diaria): R$");
        valMultaDiaria = entrada.nextDouble();
        
        Livro novoLivro = new Livro(identLivro, titulo);
        novoLivro.setValMultaDiaria(valMultaDiaria);
        
        do{
            System.out.println("\n1 - Consultar livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Sair");
            System.out.print("\nDigite a opcão: ");
            
            opcao = entrada.nextInt();
            System.out.println("");
            
            if(opcao == 1){
                System.out.println("Nome: " + novoLivro.getTitulo());
                System.out.println("ID: " + novoLivro.getIdentificacao());
                if(novoLivro.getSituacao() == false){
                    System.out.println("Situacao: Disponivel.");
                }else{
                    System.out.println("Situacao: Emprestado.");
                }
            }
            if(opcao == 2){
                if(novoLivro.getSituacao() == false){
                   novoLivro.emprestar();
                    System.out.println("Emprestimo realizado com sucesso!");
                }else{
                    System.out.println("O livro ja esta emprestado");
                }         
            }
            if(opcao == 3){
                
                if(novoLivro.getSituacao() == false){
                    System.out.println("O livro ja esta disponivel.");   
                }else{
                    System.out.print("Digite a quantidade de dias em atraso: ");
                    dias = entrada.nextInt();
                    
                    System.out.println("Valor da multa: R$" + novoLivro.devolver(dias));  
                }
                
            }
            if(opcao == 4){
                System.out.println("Encerrando...");
                break;
            }
            
        }while(opcao < 4);
        
        entrada.close();
        
    }
    
}
