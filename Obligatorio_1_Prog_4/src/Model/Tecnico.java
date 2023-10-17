package Model;

import java.util.ArrayList;

public class Tecnico extends Persona{
    private int id;
    private Equipo equipo;
    private static ArrayList<Tecnico> ListaTecnico = new ArrayList<>();

    //Id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //Lista Tecnicos
    public static ArrayList<Tecnico> getListaTecnico(){
        return ListaTecnico;
    }
    public static void setUnaListaTecnico(ArrayList<Tecnico> listasTecnico) {
        ListaTecnico = listasTecnico;
    }
    public static void setListaTecnico(Tecnico listaTecnico) {
        ListaTecnico.add(listaTecnico);
    }

    //Equipo
    public Equipo getEquipo(){
        return equipo;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    //Constructor
    public Tecnico(int ci, String nombre, String apellido, Equipo equipo){
        super(ci, nombre, apellido);
        this.equipo=equipo;
    }


}
