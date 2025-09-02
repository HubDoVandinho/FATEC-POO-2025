/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0030482411017
 */
public class Livro {
    private int identificacao;
    private String titulo;
    private boolean situacao = false;
    private double valMultaDiaria;
    
    public Livro(int id, String ti) {
        identificacao = id;
        titulo = ti;
    }

    public void setValMultaDiaria(double a) {
        valMultaDiaria = a;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean getSituacao() {
        return situacao;
    }
    
    public void emprestar(){
        situacao = true;
    }
    
    public double devolver(int dia){
        situacao = false;
        return (valMultaDiaria * dia);
    } 
   
    
    
    
}
