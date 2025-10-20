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
public class Palestrante extends Pessoa{
    private String empresa;
    private double taxaCobranca;
    private Palestra[] palestras;
    private int totalPalestras;

    public Palestrante(String empresa, String cpf, String nome) {
        super(cpf, nome);
        this.empresa = empresa;
        palestras = new Palestra[5];
    }

    public String getEmpresa() {
        return empresa;
    }

    public double getTaxaCobranca() {
        return taxaCobranca;
    }

    public void setTaxaCobranca(double taxaCobranca) {
        this.taxaCobranca = taxaCobranca/100;
    }
    
    public double calcTotalReceberPalestras(double valor){
        return valor * taxaCobranca;
    }
    
    public void addPalestras(Palestra a){
        palestras[totalPalestras] = a;
        totalPalestras++;
    }
}
