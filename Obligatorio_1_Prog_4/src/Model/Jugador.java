package Model;

import java.util.ArrayList;

public class Jugador extends Persona{

    private int id;
    private int pos;
    private int cantMinJug;
    private int sueldo;
    private static ArrayList<Jugador> ListaJugadores = new ArrayList<>();

    //Metodos de Acceso

    //id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //ListaEquipo
    public static ArrayList<Jugador> getListaJugador(){
        return ListaJugadores;
    }
    public static void setUnaListaJugador(ArrayList<Jugador> listasJugador) {
        ListaJugadores = listasJugador;
    }
    public static void setListaJugador(Jugador listaJugador) {
        ListaJugadores.add(listaJugador);
    }

    //Posicion
    public int getPos(){
        return pos;
    }
    public void setPos(int pos){
        this.pos=pos;
    }
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    //Cantidad minutos jugados
    public int getCantMinJug(){
        return cantMinJug;
    }
    public void setCantMinJug(int cantMinJug){
        this.cantMinJug=cantMinJug;
    }

    //Constructor
    public Jugador(int ci, String nombre, String apellido, int pos, int cantMinJug,int sueldo){
        super(ci, nombre, apellido);
        this.pos=pos;
        this.cantMinJug=cantMinJug;
        this.sueldo=sueldo;
    }
}
