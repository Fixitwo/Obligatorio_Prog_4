package Controller;
import Model.Arbitro;
import Model.Equipo;
import Model.Jugador;

import java.util.ArrayList;

public class ArbitroController {
    //CRUD
    public static void alta(Arbitro unA){
        unA.setId(Arbitro.getListaArbitro().size());
        Arbitro.setListaArbitro(unA);
    }
    public static void baja(int id){
        ArrayList<Arbitro> lista = Arbitro.getListaArbitro();
        Arbitro unA = Encontrar(id);
        lista.remove(unA);
        Arbitro.setUnaListaArbitro(lista);


    }
    public static void modificar(Arbitro b,Arbitro newA){
        ArrayList<Arbitro> lista = Arbitro.getListaArbitro();
        for (Arbitro a : lista) {
            if (a.getId() == b.getId()) {
                lista.set( lista.indexOf(b) , newA);
                Arbitro.setUnaListaArbitro(lista);
            }
        }
    }

    public static Boolean leer(){
        ArrayList<Arbitro> lista = Arbitro.getListaArbitro();
        if(lista.size()==0){
            return false;
        }

        for (Arbitro a : lista) {
            System.out.println("Id: "+a.getId()+" CI: "+a.getCi() + " Nombre: " + a.getNombre()+" Apellido: "+a.getApellido());
        }
        return true;
    }
    public static Arbitro Encontrar(int id){
        ArrayList<Arbitro> lista = Arbitro.getListaArbitro();

        for (Arbitro a : lista) {
            if(a.getId() == id){
                return a;
            }
        }
        return null;
    }

    public static boolean noHayArbitro(){
        ArrayList<Arbitro> lista = Arbitro.getListaArbitro();
        if (lista.size()==0)
            return true;
        return false;
    }

}
