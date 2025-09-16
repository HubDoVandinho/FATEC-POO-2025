package fatec.poo.model;

/**
 *
 * @author Fatec
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    
    public Funcionario(int r, String n, String dtAdm){
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;
    }
    
    //método abstrato
    //apresenta apenas a assinatura
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getDtAdmissao(){
        return dtAdmissao;
    }
    
    public int getRegistro(){
        return registro;
    }
    
    public String getCargo(){
           return cargo;
    }     
    
    public void setCargo(String c){
        cargo = c;
    }
}   
