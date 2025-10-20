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
public class Palestra {
    private String data;
    private String tema;
    private double valor;
    private Palestrante palestrante;
    private int totalParticipantes;
    private Participante[] participantes;
    

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }

    public Palestra(String tema, double valor) {
        this.tema = tema;
        this.valor = valor;
        participantes = new Participante[5];
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTema() {
        return tema;
    }

    public double getValor() {
        return valor;
    }
    
    public double calcTotalFaturado(){
        for(int i = 0; i < totalParticipantes; i++ ){
            if(participantes[totalParticipantes].getTipo() = 'C')
        }
    }
    
   public void addParticipante(Participante a){
       participantes[totalParticipantes] = a;
       totalParticipantes++;
   }
    
    
}
