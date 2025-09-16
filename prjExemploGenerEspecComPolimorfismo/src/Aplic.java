
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

/**
 * @author Vandinho
 */
public class Aplic {

    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                            "Pedro Silveira",
                                                            "14/05/1978",
                                                            15.80);
        funcHor.setCargo("Programador");

        funcHor.setQtdeHorTrab(90);
        System.out.println("\n\nNome             => " + funcHor.getNome());
        System.out.println("Cargo            => " + funcHor.getCargo());
        System.out.println("Registro         => " + funcHor.getRegistro());
        System.out.println("Data de admissão => " + funcHor.getDtAdmissao());
        System.out.println("Salário Bruto    => " + funcHor.calcSalBruto());
        System.out.println("Desconto         => " + funcHor.calcDesconto());
        System.out.println("Gratificação     => " + funcHor.calcGratificacao());
        System.out.println("Salário Liquido  => " + funcHor.calcSalLiquido());
        

        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020,
                                                                  "Ana Paula",
                                                                  "27/11/1991",
                                                                  650);
        funcMen.setCargo("Scrum-Master");

        funcMen.setNumSalMin(2.5);
        System.out.println("\n\nNome             => " + funcMen.getNome());
        System.out.println("Cargo            => " + funcMen.getCargo());
        System.out.println("Registro         => " + funcMen.getRegistro());
        System.out.println("Data de admissão => " + funcMen.getDtAdmissao());
        System.out.println("Salário Bruto    => " + funcMen.calcSalBruto());
        System.out.println("Desconto         => " + funcMen.calcDesconto());
        System.out.println("Salário Líquido  => " + funcMen.calcSalLiquido());
    }

}
