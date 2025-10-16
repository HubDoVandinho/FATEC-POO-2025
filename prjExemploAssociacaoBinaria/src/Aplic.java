
import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                            "Pedro Silveira",
                                                            "14/05/1978",
                                                            15.80);
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020,
                                                                  "Ana Beatriz", 
                                                                  "22/10/1997",
                                                                  600.0);
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                      "Joao Mendes",
                                                                      "10/12/1975",
                                                                      10);
        Departamento dep1 = new Departamento("CP", "Compras");
        Departamento dep2 = new Departamento("VD", "Vendas");
        
        funcHor.setCargo("Programador");
        funcMen.setCargo("Aux. Administrativo");
        funcCom.setCargo("Vendedor");
     
        
        funcHor.setDepartamento(dep1);
        System.out.println("\n---------------------------------------------------------------------------\n");
        System.out.println("O funcionario(a) horista " + funcHor.getNome() + 
                           " trabalha no departamento: " + funcHor.getDepartamento().getNome());
        
        funcMen.setDepartamento(dep1);
        System.out.println("\n---------------------------------------------------------------------------\n");
        System.out.println("O funcionario(a) mensalista " + funcMen.getNome() + 
                           " trabalha no departamento: " + funcMen.getDepartamento().getNome());
                
        funcCom.setDepartamento(dep2);
        System.out.println("\n---------------------------------------------------------------------------\n");
        System.out.println("O funcionario(a) comissionado " + funcCom.getNome() + 
                           " trabalha no departamento: " + funcCom.getDepartamento().getNome());

        dep1.addFuncionario(funcHor);
        dep1.addFuncionario(funcMen);
        
        dep2.addFuncionario(funcCom);
        
        System.out.println("\n---------------------------------------------------------------------------");
        dep1.listarFuncionarios();
        
        System.out.println("\n---------------------------------------------------------------------------");
        dep2.listarFuncionarios();
        
        Projeto proj1 = new Projeto(123, "(Insert description here)");
        Projeto proj2 = new Projeto(456, "(Insert description here)");
        
        funcHor.setProjeto(proj1);
        funcMen.setProjeto(proj2);
        funcCom.setProjeto(proj2);
        
        proj1.addFuncionario(funcHor);
        proj2.addFuncionario(funcMen);
        proj2.addFuncionario(funcCom);
        
        System.out.println("\n---------------------------------------------------------------------------");
        proj1.listarFuncionarios();
        
        System.out.println("\n---------------------------------------------------------------------------");
        proj2.listarFuncionarios();
        
        
        System.out.println("\n---------------------------------------------------------------------------\n");
        
        
        
        

                
                
        
    
    }    
}
