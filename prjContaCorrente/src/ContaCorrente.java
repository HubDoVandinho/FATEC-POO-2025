
/**
 * @author Vandinho aka Evandro 0030482411017
 */
public class ContaCorrente {

    private int numero;
    private double saldo = 0;

    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valorSaque) {
        saldo = saldo - valorSaque;
    }

    public void depositar(double valorDeposito) {
        saldo = saldo + valorDeposito;
    }

}
