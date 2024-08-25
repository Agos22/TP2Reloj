
package tp2reloj;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int altura;
    private Reloj reloj1;

    public Persona(String nombre, String apellido, int edad, int altura, Reloj reloj1) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.reloj1 = reloj1;
    }

   

    
       

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Reloj getReloj() {
        return reloj1;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setReloj(Reloj reloj) {
        this.reloj1 = reloj;
    }
    
    public void decirHora (){
        System.out.println("la hora actual es: "+ reloj1.getHora());
    }
    

   
    @Override
    public String toString (){
        return "Persona: " + "Nombre" + nombre + "Apellido" + apellido + "Edad" + edad + "Altura" + altura;
    }
}
