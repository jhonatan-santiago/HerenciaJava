package herencia;
public class Estudiante extends Persona{
    private String codigoEstudiante;
    private float notaFinal;
    
    public Estudiante(String nombre, String apellido, int edad, String codigoEstudiante,float notaFinal){
        super(nombre, apellido, edad);
        this.codigoEstudiante= codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                           "\nApellido: " + getApellido()+
                            "\nedad: "+getEdad()+
                "\nCódigo Estudiante: "+ this.codigoEstudiante+
                "\nNota final"+notaFinal);
    }
}
