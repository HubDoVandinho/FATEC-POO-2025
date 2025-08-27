
/**
 *
 * @author Vandinho
 */
public class Aplic {

    public static void main(String[] args) {
    Retangulo objRet;
    Retangulo objRet1;

    objRet = new Retangulo();
    objRet.setAltura(5.0);
    objRet.setBase(8.0);
    
    objRet1 = new Retangulo();
    objRet1.setAltura(3.0);
    objRet1.setBase(4.0);
    
    System.out.println("\n1º Retangulo:");
    System.out.println("Altura: " + objRet.getAltura());
    System.out.println("Base: " + objRet.getBase());
    System.out.println("Area: " + objRet.calcArea());
    System.out.println("Perimetro: " + objRet.calcPerimetro());
    System.out.println("Diagonal: " + objRet.calcDiagonal());
    
    System.out.println("\n2º Retangulo:");
    System.out.println("Altura: " + objRet1.getAltura());
    System.out.println("Base: " + objRet1.getBase());
    System.out.println("Area: " + objRet1.calcArea());
    System.out.println("Perimetro: " + objRet1.calcPerimetro());
    System.out.println("Diagonal: " + objRet1.calcDiagonal());
    
    
    }
    
}
