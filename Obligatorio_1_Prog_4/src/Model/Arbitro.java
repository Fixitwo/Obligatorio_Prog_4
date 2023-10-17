package Model;

import java.util.ArrayList;

public class Arbitro extends Persona{
    private int cantPartDir;
    private static ArrayList<Arbitro> ListaArbitro = new ArrayList<>();


    //Metodos de Acceso
    public int getCantPartDir(){
        return cantPartDir;
    }
    public void setCantPartDir(int cantPartDir){
        this.cantPartDir=cantPartDir;
    }

    //Lista de Arbitros
    public static ArrayList<Arbitro> getListaArbitro(){
        return ListaArbitro;
    }
    public static void setUnaListaArbitro(ArrayList<Arbitro> listaArbitro) {
        ListaArbitro = listaArbitro;
    }
    public static void setListaArbitro(Arbitro listaArbitro) {
        ListaArbitro.add(listaArbitro);
    }

    //Constructor
    public Arbitro(int ci, String nombre, String apellido, int cantPartDir){
        super(ci, nombre, apellido);
        this.cantPartDir=cantPartDir;
    }

    public String getAlbitro(){
        return "CI: "+this.getCi() +"\nNOMBRE: "+ this.getNombre() +"\nAPELLIDO: "+ this.getApellido() +"\nCANTIDAD PARTIDOS: "+ this.getCantPartDir();
    }


}
