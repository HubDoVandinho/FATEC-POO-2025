
package fatec.poo.model;

/**
 * * @author Home
 */
public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    int numFunc;
    private Funcionario[] funcionarios;
    
    public Projeto(int c, String d){
        codigo = c;
        descricao = d;
        funcionarios = new Funcionario[5];
        numFunc = 0;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }
   
    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }

     public String getDtInicio() {
        return dtInicio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void addFuncionario(Funcionario f) {
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listarFuncionarios() {
        
        System.out.println("\nCodigo do projeto: " + codigo);
        System.out.println("Descricao do projeto: " + descricao);
        System.out.println("Qtde. funcionarios: " + numFunc);
        System.out.println("\nRegistro\t\tNome\t\tCargo");
        
        for(int x = 0; x < numFunc; x++){
            System.out.print(funcionarios[x].getRegistro() + "\t\t");
            System.out.print(funcionarios[x].getNome() + "\t\t");
            System.out.println(funcionarios[x].getCargo());
        }
        
    }
    
    

    
}
