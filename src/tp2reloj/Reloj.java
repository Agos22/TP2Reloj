
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
        String[] partes = dia.split("/");
    int diaInt = Integer.parseInt(partes[0]);
    int mes = Integer.parseInt(partes[1]);
    int anio = Integer.parseInt(partes [2]);
    
    diaInt++;
    if (diaInt > 30){
    diaInt = 1;
    mes++;
    if (mes > 12){
        mes = 1;
        anio++;
     }
  }
    dia = String.format("%02d/%02d/%d", diaInt, mes, anio);
}
    
    public void incrementarHora (){
        String[] partes = hora.split (":");
        int horaInt = Integer.parseInt(partes [0]);
        int minutos = Integer.parseInt(partes[1]);
        
        minutos++;
        if (minutos >= 60){
            minutos = 0;
            horaInt ++;
            if (horaInt <=24){
                horaInt = 0;
            }
        }
        
        hora = String.format( " : ", horaInt, minutos); 
    }
    
    public void limpiaPantalla (){
        System.out.println("\"\\033[H\\033[2J\"");
        System.out.println();
    }
    
}
