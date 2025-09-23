
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;

/**
 * @author 0030482411017
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        
        PessoaFisica pesFis = new PessoaFisica("000000000xx",
                                               "Evandro Arruda",
                                               2020);
        pesFis.setBase(50.0);
        pesFis.addCompras(7000.0);
        pesFis.addCompras(2000.0);
        pesFis.addCompras(4000.0);
        System.out.println("\n\nNome:             => " + pesFis.getNome());
        System.out.println("CPF:              => " + pesFis.getCpf());
        System.out.println("Ano de inscrição: => " + pesFis.getAnoInscricao());
        System.out.println("Total de compras: => " + "R$" + df.format(pesFis.getTotalCompras()));
        System.out.println("Valor base:       => " + "R$" + df.format(pesFis.getBase()));
        System.out.println("Bônus             => " + "R$" + df.format(pesFis.calcBonus(2025)));
        
        
        PessoaJuridica pesJur = new PessoaJuridica("000000000xx",
                                                   "Gabi Soglio",
                                                   1999);
        
        pesJur.setTaxaIncentivo(10.0);
        pesJur.addCompras(200.0);
        pesJur.addCompras(750.0);
        pesJur.addCompras(300.0);
        System.out.println("\n\nNome:             => " + pesJur.getNome());
        System.out.println("CPF:              => " + pesJur.getCgc());
        System.out.println("Ano de inscrição: => " + pesJur.getAnoInscricao());
        System.out.println("Total de compras: => " + "R$" + df.format(pesJur.getTotalCompras()));
        System.out.println("Valor base:       => " + "R$" + df.format(pesJur.getTaxaIncentivo()));
        System.out.println("Bônus             => " + "R$" + df.format(pesJur.calcBonus(2025)));        
        
    
    

    }
}    
