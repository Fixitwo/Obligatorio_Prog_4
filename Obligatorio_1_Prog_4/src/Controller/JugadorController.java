package Controller;

import Model.Equipo;
import Model.Jugador;

import java.util.ArrayList;

public class JugadorController {
    //CRUD
    public static void alta(Jugador unJ){
        unJ.setId(Jugador.getListaJugador().size());
        Jugador.setListaJugador(unJ);
    }
    public static void baja(int id){

        ArrayList<Jugador> lista = Jugador.getListaJugador();
        Jugador unE = Encontrar(id);
        lista.remove(unE);
        Jugador.setUnaListaJugador(lista);
    }
    public static void modificar(Jugador b,Jugador newJ){
        ArrayList<Jugador> lista = Jugador.getListaJugador();
        for (Jugador a : lista) {
            if (a.getId() == b.getId()) {
                lista.set( b.getId() , newJ);
                Jugador.setUnaListaJugador(lista);
            }
        }
    }
    public static void leer(){
        ArrayList<Jugador> lista = Jugador.getListaJugador();

        for (Jugador a : lista) {
            System.out.println(a.getJugador());
        }
    }
    public static void leerConsulta(){
        ArrayList<Jugador> lista = Jugador.getListaJugador();

        for (Jugador a : lista) {
            System.out.println(a.getJugador());
        }
    }
    public static Jugador Encontrar(int id){
        ArrayList<Jugador> lista = Jugador.getListaJugador();

        for (Jugador a : lista) {
            if(a.getId() == id){
                return a;
            }
        }
        return null;
    }
    public static boolean noHayJugador(){
        ArrayList<Jugador> lista = Jugador.getListaJugador();
        if (lista.size()==0)
            return true;
        return false;
    }
}
