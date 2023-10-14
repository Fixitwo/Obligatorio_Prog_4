import java.util.ArrayList;

public class Tecnico extends Persona{
    private String equipo;
    private static ArrayList<Tecnico> ListaTecnico;


    //Metodos de acceso
    public String getEquipo(){
        return equipo;
    }
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    //Constructor
    public Tecnico(int ci, String nombre, String apellido, String equipo){
        super(ci, nombre, apellido);
        this.equipo=equipo;
    }

    //Metodos y Funciones
    @Override
    public void alta() {

    }

    @Override
    public void baja() {

    }

    @Override
    public void modificar() {

    }

    @Override
    public void leer() {

    }
}
