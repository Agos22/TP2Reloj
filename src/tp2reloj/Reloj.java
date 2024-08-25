
package tp2reloj;


public class Reloj {
 
    private String dia;
    private String hora;
    private String modelo;
    private long numSerie;
    private int frecuencia;

    public Reloj(String dia, String hora, String modelo, long numSerie, int frecuencia) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.frecuencia = frecuencia;
    }

   

    public String getDia() {
        return dia;
    }

    public String getHora() {
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
    
    public void incrementarDia (){
    System.out.println("Dis incrementado");
    }
       
    
    public void incrementarHora (){
       System.out.println("Hora incrementada");
    }
    
    public void limpiaPantalla (){
        System.out.println("Pantalla limpia");
        
    }
    
}
