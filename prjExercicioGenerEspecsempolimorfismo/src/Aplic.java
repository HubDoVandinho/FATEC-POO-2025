
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.util.Scanner;

/**
 * @author 0030482411017
 */
public class Aplic {

    public static void main(String[] args) {

        double peso = 90, altura = 1.75;
        String areaAtuacao = "Professor de Muay Thay";
        Instrutor objInst = new Instrutor(10, "Matheus Ourique", "(19)99252-6432");
        Cliente objCli = new Cliente("47035509895", "Evandro Arruda", "(15)98811-7704");
        
        objCli.setPeso(peso);
        objCli.setAltura(altura);
        objInst.setAreaAtuacao(areaAtuacao);
        
        System.out.println("Nome do Instrutor: " + objInst.getNome());
        System.out.println("Identificacao: " + objInst.getIdentificacao());
        System.out.println("Telefone: " + objInst.getTelefone());
        System.out.println("Area de Atuação: " + objInst.getAreaAtuacao());
        
        System.out.println("\nNome do Cliente: " + objCli.getNome());
        System.out.println("CPF: " + objCli.getCpf());
        System.out.println("telefone: " + objCli.getTelefone());
        System.out.println("Peso: " + objCli.getPeso() + "KG");
        System.out.println("Altura: " + objCli.getAltura() + "M");
    }
    
}
