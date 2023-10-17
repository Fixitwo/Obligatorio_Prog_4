package Model;

import java.util.ArrayList;

public class Equipo {
    private int id;
    private String nombre;
    private Tecnico tecnico;
    private static ArrayList<Equipo> ListaEquipo = new ArrayList<>();
    private Jugador[] jugadorTitulares = new Jugador[5];
    private Jugador[] suplentes = new Jugador[2];

    //constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    //Id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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

    //ListaEquipo
    public static ArrayList<Equipo> getListaEquipo(){
        return ListaEquipo;
    }
    public static void setUnaListaEquipo(ArrayList<Equipo> listasEquipo) {
        ListaEquipo = listasEquipo;
    }
    public static void setListaEquipo(Equipo listaEquipo) {
        ListaEquipo.add(listaEquipo);
    }

    //Tecnico
    public Tecnico getTecnico() {
        return tecnico;
    }
    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
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


}
