
package tp2reloj;


public class TP2Reloj {

    
    public static void main(String[] args) {
        
       RelojFit relojf = new RelojFit (50, "24/08/24 ", "10:00 ", "MD456 ", 1234567890123456789L, 10);
       
       Persona persona = new Persona ("Simon", "Gomez", 33, 180);
       
        System.out.println("Informacion Inicial del Reloj: ");
        System.out.println(relojf);
        
        relojf.incrementarDia();
        relojf.incrementarHora();
        
        System.out.println("Incrementando dia y hora...");
        System.out.println(relojf);
        
        System.out.println("Limpiando pantalla...");
        System.out.println(relojf);
        
        
        System.out.println("Pantalla limpia. Actualizacion de reloj: ");
        System.out.println(relojf);
        
        
        
       
       
       
       
       
        
    }
    
}
