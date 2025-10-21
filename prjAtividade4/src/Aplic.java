
package fatec.poo.model;


/**
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
        double valorTotal = 0;
        for(int i = 0; i < totalParticipantes; i++ ){
            if(participantes[i].getTipo() == 'C'){
                valorTotal += valor;
            }else{
                if(participantes[i].getTipo() == 'E'){
                    valorTotal += (valor - (valor * 0.15));
                }else{
                    if(participantes[i].getTipo() == 'I'){
                        valorTotal += (valor - (valor * 0.2));
                    }
                }
            }
        }
        return valorTotal;  
    }
    
    public void addParticipante(Participante a){
       participantes[totalParticipantes] = a;
       totalParticipantes++;
    }
    
}
