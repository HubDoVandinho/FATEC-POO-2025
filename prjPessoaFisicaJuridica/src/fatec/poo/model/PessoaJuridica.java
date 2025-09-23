package fatec.poo.model;

/**
 * @author 0030482411017
 */
public class PessoaJuridica extends Pessoa {
    private String cgc;
    private double taxaIncetivo;
    
    public PessoaJuridica(String c, String n, int ai){
        super(n, ai);
        cgc = c;
    }
    
    public double calcBonus(int a){
        return((taxaIncetivo * getTotalCompras()) * (a - getAnoInscricao()));
    }
    
    public void setTaxaIncentivo(double ti){
        taxaIncetivo = (ti / 100);
    }
    
    public String getCgc(){
        return cgc;
    }
    
    public double getTaxaIncentivo(){
        return taxaIncetivo;
    }
}
