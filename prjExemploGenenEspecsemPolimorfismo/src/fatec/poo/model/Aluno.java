
package fatec.poo.model;

/**
 * Vandinho 0030482411017
 */

public class Aluno extends Pessoa{
    private int regEscolar;
    private double mensalidade;

    public Aluno(int re, String n, String dn) {
        super(n, dn);
        regEscolar = re;
    }
    
    public void setMensalidade(double m) {
        mensalidade = m;
    }

    public int getRegEscolar() {
        return regEscolar;
    }

    public double getMensalidade() {
        return mensalidade;
    }
    
}   
    
