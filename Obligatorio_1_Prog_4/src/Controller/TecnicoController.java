package Controller;

import Model.Jugador;
import Model.Tecnico;

import java.util.ArrayList;

public class TecnicoController {
    //CRUD
    public static void alta(Tecnico unT){
        System.out.println("alta");
    }
    public static void baja(Tecnico unT){
        System.out.println("baja");
    }
    public static void modificar(Tecnico unT){
        System.out.println("modificar");
    }
    public static void leer(){
        System.out.println("ver");
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
}
