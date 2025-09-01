
import java.util.Scanner;

/**
 * @author 0030482411017
 */
public class Aplic {

    public static void main(String[] args) {
        double medRaio;
        Scanner entrada = new Scanner(System.in);
        int opcao;
        String unidade;
        
        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();
        Circulo objCir = new Circulo(unidade);

        System.out.print("Digite a tamanho do raio: ");
        medRaio = entrada.nextDouble();
        objCir.setRaio(medRaio);

        do {
            System.out.println("\n\n1 - Consultar medida da área;");
            System.out.println("2 - Consultar medida do perimetro;");
            System.out.println("3 - Consultar medida da diametro;");
            System.out.println("4 - Encerrar.");
            System.out.print("\nDigite a opção: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("\nMedida da área: " + 
                                   objCir.calcArea() + " " + 
                                   objCir.getUnidadeMedida() + "²");
            } else if (opcao == 2) {
                System.out.println("\nMedida do perimetro: " + 
                                   objCir.calcPerimetro() + " " + 
                                   objCir.getUnidadeMedida());
            } else if (opcao == 3) {
                System.out.println("\nMedida da diametro: " + 
                                   objCir.calcDiametro() + " " + 
                                   objCir.getUnidadeMedida());
            }

        } while (opcao < 4);

    }

}
