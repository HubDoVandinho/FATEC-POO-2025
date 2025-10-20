
import fatec.poo.model.Palestra;
import fatec.poo.model.Palestrante;
import fatec.poo.model.Participante;
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0030482411017
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("R$#,##0.00");
        DecimalFormat porc = new DecimalFormat("#0.0%");
        //Instanciando palestrantes
        Palestrante palestrante1 = new Palestrante("UniRide",
                                             "00000000001",
                                             "Vandinho Catatau");
        palestrante1.setTaxaCobranca(40);
        
        //Instanciando participantes
        Participante part1 = new Participante('C',
                                              "00000000002",
                                              "Matheus Portes");
        
        Participante part2 = new Participante('I',
                                              "00000000003",
                                              "Marcos Marciano");
        
        Participante part3 = new Participante('E',
                                              "00000000004",
                                              "Gabi Soglio");
        
        Participante part4 = new Participante('C',
                                              "00000000005",
                                              "Pedro Isse");
        
        Participante part5 = new Participante('C',
                                              "00000000006",
                                              "Lauren Oliveira");
        
        //Instanciando palestras
        Palestra palestra1 = new Palestra("(Insert text here)", 2000.0);
        Palestra palestra2 = new Palestra("(Insert text here)", 1200.0);
        
        //Adicionando palestrante as palestras 1 e 2
        palestrante1.addPalestras(palestra1);
        palestrante1.addPalestras(palestra2);
        
        //Adicionando participantes na palestra1
        palestra1.addParticipante(part1);
        palestra1.addParticipante(part2);
        palestra1.addParticipante(part3);
        
        //Adicionando participantes na palestra2
        palestra2.addParticipante(part4);
        palestra2.addParticipante(part5);
        
        //----------------------------------------
        System.out.println("------------------------------------------------");
        System.out.println("CPF do palestrante: " + palestrante1.getCpf());
        System.out.println("Nome: " + palestrante1.getNome());
        System.out.println("Taxa de Cobranca: " + porc.format(palestrante1.
                                                              getTaxaCobranca()));
        
        System.out.println("Valor toal a receber pelas palestras: " + (df.format
                          (palestrante1.calcTotalReceberPalestras(
                           palestra1.calcTotalFaturado() +
                           palestra2.calcTotalFaturado()))));
        System.out.println("------------------------------------------------");

    }
    
}
