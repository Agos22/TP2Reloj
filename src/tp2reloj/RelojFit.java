
package tp2reloj;

import java.util.Random;


public class RelojFit extends Reloj {

    private int pasos;

    public RelojFit(int pasos, String dia, String hora, String modelo, long numSerie, int frecuencia) {
        super(dia, hora, modelo, numSerie, frecuencia);
        this.pasos = pasos;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

   
    public void cuentaPasos (int x, int y){
        System.out.println("contando pasos...");
    
}
    public void frecuenciaaleatoria (){
        Random r = new Random();
        int nuevaFrec = r.nextInt(101) + 50;
        setFrecuencia(nuevaFrec);
    }

    

   
}
