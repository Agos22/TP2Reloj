package tp2reloj;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reloj {

    private LocalDate dia;
    private LocalTime hora;
    private String modelo;
    private long numSerie;
    private int frecuencia;

    public Reloj(LocalDate dia, LocalTime hora, String modelo, long numSerie, int frecuencia) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.frecuencia = frecuencia;
    }

    public LocalDate getDia() {
        return dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getModelo() {
        return modelo;
    }

    public long getNumSerie() {
        return numSerie;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    @Override
    public String toString() {
        return "Reloj{" + "dia=" + dia + ", hora=" + hora + ", modelo=" + modelo + ", numSerie=" + numSerie + ", frecuencia=" + frecuencia + '}';
    }

    public void incrementarDia(int cant) {
        this.dia = dia.plusDays(cant);
        System.out.println("La cantidad de dias ingresados es " + cant + " y la fecha es " + dia);
    }

    public void incrementarHora(int cant) {
        this.hora = hora.plusHours(cant);
        System.out.println("La cantidad de horas ingresados es " + cant + " y la hora es " + hora);
    }

    public void limpiaPantalla() {
        System.out.println("Pantalla limpia");

    }

}
