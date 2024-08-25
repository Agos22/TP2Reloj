package tp2reloj;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class RelojFit extends Reloj {

    private int pasos;

    public RelojFit(int pasos, LocalDate dia, LocalTime hora, String modelo, long numSerie, int frecuencia) {
        super(dia, hora, modelo, numSerie, frecuencia);
        this.pasos = pasos;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

    public void cuentaPasos(int x, int y) {
        System.out.println("contando pasos...");
        this.pasos = x + y;
        System.out.println("la cantidad de pasos son " + this.pasos);

    }

    public void frecuenciaaleatoria() {
        Random r = new Random();
        int nuevaFrec = r.nextInt(101) + 50;
        setFrecuencia(nuevaFrec);
    }

}
