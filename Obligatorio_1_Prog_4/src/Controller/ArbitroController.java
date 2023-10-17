package Controller;
import Model.Arbitro;
import Model.Jugador;

import java.util.ArrayList;

public class ArbitroController {
    //CRUD
    public static void alta(Arbitro unA){
        Arbitro.setListaArbitro(unA);
    }
    public static void baja(int ci){
        ArrayList<Arbitro> lista = Arbitro.getListaArbitro();
        Arbitro unA = Encontrar(ci);
        lista.remove(unA);
        Arbitro.setUnaListaArbitro(lista);


    }
    public static void modificar(Arbitro b,Arbitro newA){
        ArrayList<Arbitro> lista = Arbitro.getListaArbitro();
        for (Arbitro a : lista) {
            if (a.getCi() == b.getCi()) {
                lista.set( lista.indexOf(b) , newA);
                Arbitro.setUnaListaArbitro(lista);
            }
        }
    }

    public static void leer(){
        ArrayList<Arbitro> lista = Arbitro.getListaArbitro();

        for (Arbitro a : lista) {
            System.out.println(a.getCi() + " " + a.getNombre()+" "+a.getApellido());
        }
    }
    public static Arbitro Encontrar(int ci){
        ArrayList<Arbitro> lista = Arbitro.getListaArbitro();

        for (Arbitro a : lista) {
            if(a.getCi() == ci){
                return a;
            }
        }
        return null;
    }
}
