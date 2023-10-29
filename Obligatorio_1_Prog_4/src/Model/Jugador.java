package Model;

import java.util.ArrayList;

public class Jugador extends Persona{

    private int id;
    private int pos;
    private int cantMinJug;
    private int sueldoBase=1000000;
    private double sueldoPrima;
    private static ArrayList<Jugador> ListaJugadores = new ArrayList<>();

    //Metodos de Acceso

    //jugador
    public String getJugador(){
        return this.getId()+ " CI: " + this.getCi() +" Nombre: "+ this.getNombre() + " Apellido: " + this.getApellido() + " Posicion: " + this.getPos() +" minJugados: " + this.getCantMinJug();
    }

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


    //Cantidad minutos jugados
    public int getCantMinJug(){
        return cantMinJug;
    }
    public void setCantMinJug(int cantMinJug){
        this.cantMinJug=cantMinJug;
    }

    //Constructor
    public Jugador(int ci, String nombre, String apellido, int pos, int cantMinJug){
        super(ci, nombre, apellido);
        this.pos=pos;
        this.cantMinJug=cantMinJug;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getSueldoPrima() {
        return sueldoPrima;
    }

    public void setSueldoPrima(double sueldoPrima) {
        this.sueldoPrima = sueldoPrima;
    }
}
