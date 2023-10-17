package Controller;
import Model.Arbitro;
import Model.Equipo;
import Model.Jugador;
import Model.Tecnico;

import java.util.ArrayList;

public class EquipoController {
    //CRUD
    public static void alta(Equipo unE){
        unE.setId(Equipo.getListaEquipo().size());
        Equipo.setListaEquipo(unE);
    }
    public static void altaJugador(int id,Equipo unE){
        Jugador unJ = JugadorController.Encontrar(id);
        unE.setJugadorTitulares(unJ);
    }
    public static void altaSuplentes(int id,Equipo unE){
        Jugador unJ = JugadorController.Encontrar(id);
        unE.setSuplentes(unJ);
    }
    public static void altaTecnico(int id,Equipo unE){
        Tecnico unJ = TecnicoController.Encontrar(id);
        unE.setTecnico(unJ);
    }
    public static void baja(int id){

        ArrayList<Equipo> lista = Equipo.getListaEquipo();
        Equipo unE = Encontrar(id);
        lista.remove(unE);
        Equipo.setUnaListaEquipo(lista);
    }
    public static void modificar(Equipo b,Equipo newE){
        ArrayList<Equipo> lista = Equipo.getListaEquipo();
        for (Equipo a : lista) {
            if (a.getId() == b.getId()) {
                lista.set( b.getId() , newE);
                Equipo.setUnaListaEquipo(lista);
            }
        }
    }
    public static void leer(){
        ArrayList<Equipo> lista = Equipo.getListaEquipo();

        for (Equipo a : lista) {
            System.out.println(a.getId()+" "+ a.getNombre());
        }
    }
    public static void leerJugador(Equipo unE){

        Jugador[] lista = unE.getJugadorTitulares();
        for (Jugador a : lista) {
            if(a != null){
                System.out.println(a.getId()+" "+ a.getNombre());
            }

        }
    }
    public static void leerSuplentes(Equipo unE){

        Jugador[] lista = unE.getSuplentes();
        for (Jugador a : lista) {
            if(a != null){
                System.out.println(a.getId()+" "+ a.getNombre());
            }

        }
    }
    public static Equipo Encontrar(int id){
        ArrayList<Equipo> lista = Equipo.getListaEquipo();

        for (Equipo a : lista) {
            if(a.getId() == id){
                return a;
            }
        }
        return null;
    }
}
