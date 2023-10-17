package Model;

public abstract class Persona {
    private int ci;
    private String nombre;
    private String apellido;

    //Metodos de Acceso
    public int getCi() {
        return ci;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setCi(int ci){
         this.ci=ci;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Constructor
    public Persona(int ci, String nombre, String apellido){
        this.ci=ci;
        this.nombre=nombre;
        this.apellido=apellido;
    }

}
