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
public class Instrutor extends Pessoa {

    private int identificacao;
    private String areaAtuacao;

    public Instrutor(int i, String n, String t) {
        super(n, t);
        identificacao = i;
    }

    public int getIdentificacao() {
        return identificacao;
    }
    
    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String aA) {
        areaAtuacao = aA;
    }

}
