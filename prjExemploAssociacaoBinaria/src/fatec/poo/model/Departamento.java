
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
        funcionarios = new Funcionario[5];
        numFunc = 0;
    }
    
    public String getSigla(){
        return sigla;
    }
    
    public String getNome(){
        return nome;
    }

    public void addFuncionario(Funcionario f) {
        funcionarios[numFunc] = f;
        numFunc++;
    }

    public void listarFuncionarios() {
        
        System.out.println("\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtde. funcionarios: " + numFunc);
        System.out.println("\nRegistro\tNome\t\t\tCargo");
        
        for(int x = 0; x < numFunc; x++){
            System.out.print(funcionarios[x].getRegistro() + "\t\t");
            System.out.print(funcionarios[x].getNome() + "\t\t");
            System.out.println(funcionarios[x].getCargo());
        }
        
    }
     
}
