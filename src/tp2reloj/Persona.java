
package tp2reloj;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int altura;
    private Reloj reloj;

    public Persona(String nombre, String apellido, int edad, int altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Reloj getReloj() {
        return reloj;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }
    
    public void decirHora (){
        
    }
    
    public void hablar (){
        
    }

    public void comer (){
        
    }
    
    @Override
    public String toString (){
        return "Persona: " + "Nombre" + nombre + "Apellido" + apellido + "Edad" + edad + "Altura" + altura;
    }
}
