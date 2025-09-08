
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;


/**
 * @author 0030482411017
 */

public class Aplic {

    public static void main(String[] args) {
        Aluno objAlu = new Aluno(1010, "Vandinho Arruda","14/10/2004");
        Professor objProf = new Professor(1515, "Cheddar Munari", "01/01/0001");

        objAlu.setMensalidade(1500);

        System.out.println("Registro escolar: " + objAlu.getRegEscolar());
        System.out.println("Nome: " + objAlu.getNome());
        System.out.println("Data de Nascimento: " + objAlu.getDataNascimento());
        System.out.println("Mensalidade: " + objAlu.getMensalidade());

        objProf.setSalario(30000);
        
        System.out.println("\nRegistro funcional: " + objProf.getRegFuncional());
        System.out.println("Nome: " + objProf.getNome());
        System.out.println("Data de Nascimento: " + objProf.getDataNascimento());
        System.out.println("Mensalidade: " + objProf.getSalario());




        
    }
    
}

