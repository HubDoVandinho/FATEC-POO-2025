/**
 * @author Evandro Rodrigues 0030482411017                                  aka vandinho
 */
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) throws Exception {
        Aluno objAluno = new Aluno();
        double NtPrv1, NtPrv2, NtTrab1, NtTrab2;
        String RA;
        int opcao;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o RA do aluno: ");
        RA = entrada.next();
        objAluno.setRA(RA);
        System.out.print("Digite a nota da primeira prova: ");
        NtPrv1 = entrada.nextDouble();
        objAluno.setNtPrv1(NtPrv1);
        System.out.print("Digite a nota da segunda prova: ");
        NtPrv2 = entrada.nextDouble();
        objAluno.setNtPrv2(NtPrv2);
        System.out.print("Digite a nota do primeiro trabalho: ");
        NtTrab1 = entrada.nextDouble();
        objAluno.setNtTrab1(NtTrab1);
        System.out.print("Digite a nota do segundo trabalho: ");
        NtTrab2 = entrada.nextDouble();
        objAluno.setNtTrab2(NtTrab2);

        do {
            System.out.println("\n\nMenu de opcoes:");
            System.out.println("\n1 - Exibir Nota das Provas/Trabalhos");
            System.out.println("2 - Exibir Media dos Trabalhos/Provas");
            System.out.println("3 - Exibir Media Final");
            System.out.println("4 - Sair");
            System.out.print("\nDigite a opcao: ");

            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("\nRA: " + objAluno.getRA());
                System.out.println("Nota da primeira prova: " + objAluno.getNtPrv1());
                System.out.println("Nota da segunda prova: " + objAluno.getNtPrv2());
                System.out.println("Nota do primeiro trabalho: " + objAluno.getNtTrab1());
                System.out.println("Nota do segundo trabalho: " + objAluno.getNtTrab2());
            } else if (opcao == 2) {
                System.out.println("\nRA: " + objAluno.getRA());
                System.out.println("Media das provas: " + objAluno.calcMediaProva());
                System.out.println("Media dos trabalhos: " + objAluno.calcMediaTrab());
            } else if (opcao == 3) {
                System.out.println("\nRA: " + objAluno.getRA());
                System.out.println("Media final: " + objAluno.calcMediaFinal());
            }else if (opcao == 4) {
                System.out.println("\nEncerrando...");
            }

        } while (opcao < 4);

        entrada.close();

    }
}
