import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private Tecnico tecnico;
    private static ArrayList<Equipo> ListaEquipo;
    private Jugador[] jugadorTitulares = new Jugador[5];
    private Jugador[] suplentes = new Jugador[2];

    //constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    //Nombre
    public String getNombre() {
        return nombre;
    }
    public boolean setNombre(String nombre) {
        if (this.nombre == null){
            this.nombre = nombre;
            return true;
        }
        return false;
    }

    //Tecnico
    public Tecnico getTecnico() {
        return tecnico;
    }
    public boolean setTecnico(Tecnico tecnico) {
        if (this.tecnico == null){
            this.tecnico = tecnico;
            return true;
        }
        return false;
    }

    //jugador
    public Jugador[] getJugadorTitulares() {
        return jugadorTitulares;
    }
    public boolean setJugadorTitulares(Jugador pJugador) {
        for (int i = 0; i < this.jugadorTitulares.length; i++) {
            if (this.jugadorTitulares[i] == null){
                this.jugadorTitulares[i] = pJugador;
                return true;
            }
        }
        return false;
    }

    //Suplentes
    public Jugador[] getSuplentes() {
        return suplentes;
    }
    public boolean setSuplentes(Jugador pSuplentes) {
        for (int i = 0; i < this.suplentes.length; i++) {
            if (this.suplentes[i] == null){
                this.suplentes[i] = pSuplentes;
                return true;
            }
        }
        return false;
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
