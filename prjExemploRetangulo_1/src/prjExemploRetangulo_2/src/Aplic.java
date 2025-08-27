
import java.util.Scanner;

/**
 * @author Vandinho
 */
public class Aplic {

    public static void main(String[] args) {
        double medAlt, medBase;
        Scanner entrada = new Scanner(System.in);
        int opcao;

        System.out.print("Digite a medida da altura do retangulo: ");
        medAlt = entrada.nextDouble();
        System.out.print("Digite a medida da base do retangulo: ");
        medBase = entrada.nextDouble();

        Retangulo objRet = new Retangulo();
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);

        do {
            System.out.println("\n\n1 - Consultar medida da área;");
            System.out.println("2 - Consultar medida do perimetro;");
            System.out.println("3 - Consultar medida da diagonal;");
            System.out.println("4 - Encerrar.");
            System.out.print("\nDigite a opção: ");
            opcao = entrada.nextInt();

            System.out.println("\n\nValor da altura: "+ objRet.getAltura());
            System.out.println("Valor da base: "+objRet.getBase());
            
            if (opcao == 1) {
                System.out.println("\nMedida da área: " + objRet.calcArea());
            } else if (opcao == 2) {
                System.out.println("\nMedida do perimetro: " + objRet.calcPerimetro());
            } else if (opcao == 3) {
                System.out.println("\nMedida da diagonal: " + objRet.calcDiagonal());
            }

        }while (opcao < 4);

    
    
    }

}
