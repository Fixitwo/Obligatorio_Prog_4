package Model;

import java.util.ArrayList;

public class Arbitro extends Persona{
    private int id;
    private int cantPartDir;
    private int aniosTrabj;
    private int sueldoBase=50000;
    private double sueldoPrima;
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
    public Arbitro(int ci, String nombre, String apellido, int cantPartDir, int aniosTrabj){
        super(ci, nombre, apellido);
        this.cantPartDir=cantPartDir;
        this.aniosTrabj=aniosTrabj;
    }

    public String getAlbitro(){
        return "CI: "+this.getCi() +"\nNOMBRE: "+ this.getNombre() +"\nAPELLIDO: "+ this.getApellido() +"\nCANTIDAD PARTIDOS: "+ this.getCantPartDir();
    }


    public int getAniosTrabj() {
        return aniosTrabj;
    }

    public void setAniosTrabj(int aniosTrabj) {
        this.aniosTrabj = aniosTrabj;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
