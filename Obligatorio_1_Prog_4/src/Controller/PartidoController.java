package Controller;

import Model.Partido;
import Model.Tecnico;

import java.util.ArrayList;

public class PartidoController {
    //CRUD
        public static void alta(Partido unP){
            unP.setId(Partido.getListaPartido().size());
            Partido.setListaPartido(unP);
        }
        public static void baja(int id){

            ArrayList<Partido> lista = Partido.getListaPartido();
            Partido unP = PartidoController.Encontrar(id);
            lista.remove(unP);
            Partido.setUnaListaPartido(lista);
        }
        public static void modificar(Partido b,Partido newP){
            ArrayList<Partido> lista = Partido.getListaPartido();
            for (Partido a : lista) {
                if (a.getId() == b.getId()) {
                    lista.set( b.getId() , newP);
                    Partido.setUnaListaPartido(lista);
                }
            }
        }
        public static void leer(){
            ArrayList<Partido> lista = Partido.getListaPartido();

            for (Partido a : lista) {
                System.out.println(a.getId()+" "+ a.getPartido());
            }
        }
        public static Partido Encontrar(int id){
            ArrayList<Partido> lista = Partido.getListaPartido();

            for (Partido a : lista) {
                if(a.getId() == id){
                    return a;
                }
            }
            return null;
        }
}
