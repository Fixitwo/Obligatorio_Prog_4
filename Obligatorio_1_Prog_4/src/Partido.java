import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
public class Partido {
    private Arbitro arbitroPartido;
    private LocalTime fechaPartido;
    private static ArrayList<Partido> ListaPartido;
    private Equipo[] equipoPartido = new Equipo[2];

    //Arbitro
    public Arbitro getArbitroPartido() {
        return arbitroPartido;
    }
    public void setArbitroPartido(Arbitro arbitroPartido) {
        this.arbitroPartido = arbitroPartido;
    }

    //Fecha
    public LocalTime getFechaPartido() {
        return fechaPartido;
    }
    public void setFechaPartido(LocalTime fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    //Equipos
    public Equipo[] getEquipoPartido() {
        return equipoPartido;
    }
    public void setEquipoPartido(Equipo[] equipoPartido) {
        this.equipoPartido = equipoPartido;
    }

    //CRUD
    public void alta(){
        System.out.println("Alta");
    }
    public void baja(){
        System.out.println("Baja");
    }
    public void modificar(){
        System.out.println("modificar");
    }
    public void leer(){
        System.out.println("leer");
    }
}
