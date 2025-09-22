
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 * @author Vandinho
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
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
        System.out.println("Salário Bruto    => " + df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto         => " + df.format(funcHor.calcDesconto()));
        System.out.println("Gratificação     => " + df.format(funcHor.calcGratificacao()));
        System.out.println("Salário Liquido  => " + df.format(funcHor.calcSalLiquido()));
        

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
        System.out.println("Salário Bruto    => " + df.format(funcMen.calcSalBruto()));
        System.out.println("Desconto         => " + df.format(funcMen.calcDesconto()));
        System.out.println("Salário Líquido  => " + df.format(funcMen.calcSalLiquido()));

        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030,
                                                                      "Matheus Portes",
                                                                      "11/07/2005",
                                                                       10);
        funcCom.setCargo("Estagiario em Engenharia de Prompt");
        
        funcCom.addVendas(1000.0);
        funcCom.addVendas(4000.0);
        funcCom.addVendas(3000.0);
        funcCom.setSalBase(900.0);
        System.out.println("\n\nNome             => " + funcCom.getNome());
        System.out.println("Cargo            => " + funcCom.getCargo());
        System.out.println("Registro         => " + funcCom.getRegistro());
        System.out.println("Data de admissão => " + funcCom.getDtAdmissao());
        System.out.println("Salário Bruto    => " + df.format(funcCom.calcSalBruto()));
        System.out.println("Desconto         => " + df.format(funcCom.calcDesconto()));
        System.out.println("Gratificação     => " + df.format(funcCom.calcGratificacao()));
        System.out.println("Salário Líquido  => " + df.format(funcCom.calcSalLiquido()));
        
    }

}

