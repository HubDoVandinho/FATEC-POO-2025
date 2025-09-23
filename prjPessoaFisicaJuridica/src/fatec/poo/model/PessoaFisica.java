package fatec.poo.model;

/**
 * @author Vandinho
 */
public class PessoaFisica extends Pessoa {

    private String cpf;
    private double base;

    public PessoaFisica(String c, String n, int ai) {
        super(n, ai);
        cpf = c;
    }
    
    public double calcBonus(int a){
        if(getTotalCompras() > 12000.0){
            return((a - getAnoInscricao()) * base);
        }else{
            return 0;
        }
    }
    
    public void setBase(double b){
        base = b;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public double getBase(){
        return base;
    }
    
    
    
}

            

