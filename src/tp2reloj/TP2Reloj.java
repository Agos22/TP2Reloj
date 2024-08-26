
package tp2reloj;

import java.time.LocalDate;
import java.time.LocalTime;


public class TP2Reloj {

    
    public static void main(String[] args) {
        
     // Reloj reloj1 = new Reloj( "Martes", "16:30", "CPT",040404, 14);
      //Persona perso = new Persona ("Simon", "Gomez", 12, 180, reloj1);
       RelojFit UnrelojFit = new RelojFit (10, LocalDate.now(),LocalTime.now(),"Cassio", 01001, 100 );
       Persona unaPersona = new Persona ("Jorge", " Perez", 25, 172,UnrelojFit);
       
       unaPersona.decirHora();
       unaPersona.mostrarInfo();
       UnrelojFit.cuentaPasos(10, 17);
       UnrelojFit.frecuenciaaleatoria();
       UnrelojFit.limpiaPantalla();
       
      
              
      
   
       
      
        
        
       
       
       
       
       
        
    }
    
}
