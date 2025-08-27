/**
 * @author Vandinho
 */
public class Exemplo5 {
    public static void main(String[] args) {
        int cont = 1;
        int Num = (int)(Math.random() * 100);
    
        System.out.println("TABUADA DO " + Num + "\n");
    
        do{
            System.out.println(Num + " * " + cont + " = " + cont * Num);
            cont++;
        }while(cont <= 10);
    }
    
}
