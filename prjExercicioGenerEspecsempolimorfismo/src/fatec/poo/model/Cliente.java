/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author 0030482411017
 */
public class Cliente extends Pessoa {

    private String cpf;
    private double peso;
    private double altura;

    public Cliente(String c, String n, String t) {
        super(n, t);
        cpf = c;
    }

    public String getCpf() {
        return cpf;
    }

    public void setPeso(double p) {
        peso = p;
    }

    public void setAltura(double alt) {
        altura = alt;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

}
