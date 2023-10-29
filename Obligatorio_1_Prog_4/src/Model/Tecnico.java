package Model;

import java.util.ArrayList;

public class Tecnico extends Persona{
    private int id;
    private Equipo equipo;
    private int partidosGanados;
    private int sueldoBase=800000;
    private double sueldoPrima;
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
    public Tecnico(int ci, String nombre, String apellido, Equipo equipo, int partidosGanados){
        super(ci, nombre, apellido);
        this.equipo=equipo;
        this.partidosGanados=partidosGanados;
    }


    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
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
