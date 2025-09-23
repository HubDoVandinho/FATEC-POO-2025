package fatec.poo.model;


/**
 * @author Vandinho
 */
public abstract class Pessoa {

    private String nome;
    private int anoInscricao;
    private double totalCompras;

    public Pessoa(String n, int ai) {
        nome = n;
        anoInscricao = ai;
    }

    abstract public double calcBonus(int a);
    
    public void addCompras(double tc) {
        totalCompras += tc;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompras() {
        return totalCompras;
    }
}
