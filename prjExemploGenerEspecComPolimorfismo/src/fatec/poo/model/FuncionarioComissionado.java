package fatec.poo.model;

/**
 * @author Vandinho
 */
public class FuncionarioComissionado extends Funcionario {

    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncionarioComissionado(int r, String n, String dtAdm, double tC) {
        super(r, n, dtAdm);
        taxaComissao = tC;
    }

    public void setSalBase(double sB) {
        salBase = sB;
    }

    public double getSalbase() {
        return salBase;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void addVendas(Double v) {
        totalVendas += v;
    }

    public double calcSalBruto() {
        return (salBase + (taxaComissao/100) * totalVendas);
    }

    public double calcGratificacao() {
        if (totalVendas > 10000) {
            return (calcSalBruto() * 0.05);
        } else {
            if (totalVendas > 5000) {
                return (calcSalBruto() * 0.03);
            } else {
                return 0;
            }
        }
    }
    
    public double calcSalLiquido(){
        return (calcSalBruto() - calcDesconto() + calcGratificacao());
    }
}

