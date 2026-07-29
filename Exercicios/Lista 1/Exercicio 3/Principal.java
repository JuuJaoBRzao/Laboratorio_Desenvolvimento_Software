package newpackage;

/**
 *
 * @author laboratorio
 */
public class Principal {
    public static void main(String[] args) {
        Casa c = new Casa();
    
        System.out.println("Preco: "+c.calcularPreco(120));
        System.out.println("Preco total com quartos: "+c.calcularPreco(120, 3));
    }  
}
