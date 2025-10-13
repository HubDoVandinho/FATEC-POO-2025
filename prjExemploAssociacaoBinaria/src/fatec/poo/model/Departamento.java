
package fatec.poo.model;

/**
 * @author 0030482411017
 */
public class Departamento {
    private String sigla;
    private String nome;
    int numFunc;
    private Funcionario[] funcionarios;
    
    public Departamento(String s, String n){
        sigla = s;
        nome = n;
    }
    
    public String getSigla(){
        return sigla;
    }
    
    public String getNome(){
        return nome;
    }

    public void addFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Funcionario[] listaFuncionarios() {
        return funcionarios;
    }
     
}
