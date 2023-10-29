package Controller;

import Model.Equipo;
import Model.Jugador;
import Model.Tecnico;

import java.util.ArrayList;

public class TecnicoController {
    //CRUD
    public static void alta(Tecnico unT){
        unT.setId(Tecnico.getListaTecnico().size());
        Tecnico.setListaTecnico(unT);
    }
    public static void baja(int id){

        ArrayList<Tecnico> lista = Tecnico.getListaTecnico();
        Tecnico unT = Encontrar(id);
        lista.remove(unT);
        Tecnico.setUnaListaTecnico(lista);
    }
    public static void modificar(Tecnico b,Tecnico newT){
        ArrayList<Tecnico> lista = Tecnico.getListaTecnico();
        for (Tecnico a : lista) {
            if (a.getId() == b.getId()) {
                lista.set( b.getId() , newT);
                Tecnico.setUnaListaTecnico(lista);
            }
        }
    }
    public static void leer(){
        ArrayList<Tecnico> lista = Tecnico.getListaTecnico();

        for (Tecnico a : lista) {
            System.out.println(a.getId()+" "+ a.getNombre());
        }
    }
    public static Tecnico Encontrar(int id){
        ArrayList<Tecnico> lista = Tecnico.getListaTecnico();

        for (Tecnico a : lista) {
            if(a.getId() == id){
                return a;
            }
        }
        return null;
    }
    public static void leerTecnico(Tecnico unT){

        ArrayList <Tecnico> lista = unT.getListaTecnico();
        for (Tecnico a : lista) {
            if(a != null){
                System.out.println(a.getId()+" "+ a.getNombre());
            }
        }
    }

    public static boolean noHayTecnico(){
        ArrayList<Tecnico> lista = Tecnico.getListaTecnico();
        if (lista.size()==0)
            return true;
        return false;
    }
}
