
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
        DecimalFormat df = new DecimalFormat("#,##0.00");
        //Instanciando palestrantes
        Palestrante palestrante1 = new Palestrante("UniRide",
                                             "00000000001",
                                             "Vandinho Catatau");
        
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
        Palestra palestra2 = new Palestra("(Insert text here )", 1200.0);
        
        
        
        
        
    }
    
}
