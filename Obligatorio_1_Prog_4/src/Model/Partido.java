package Model;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Partido {
    private Arbitro arbitroPartido;
    private LocalDate fechaPartido;
    private LocalTime horaPartido;
    private static ArrayList<Partido> ListaPartido = new ArrayList<>();
    private Equipo[] equipoPartido = new Equipo[2];
    private int id;

    //Constructor
    public Partido(Arbitro arbitro, LocalDate fechaPartido,LocalTime horaPartido, Equipo equipo){
        this.arbitroPartido=arbitro;
        this.fechaPartido=fechaPartido;
        this.horaPartido=horaPartido;
        setEquipoPartido(equipo);
    }

    //Arbitro
    public Arbitro getArbitroPartido() {
        return arbitroPartido;
    }
    public void setArbitroPartido(Arbitro arbitroPartido) {
        this.arbitroPartido = arbitroPartido;
    }

    //Fecha
    public LocalDate getFechaPartido() {
        return fechaPartido;
    }
    public void setFechaPartido(LocalDate fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    //Equipos
    public String getEquipoPartido() {
        return equipoPartido[0].getNombre() + " vs " + equipoPartido[1].getNombre();
    }
    public void setEquipoPartido(Equipo equipoPartido) {
        for (int i = 0; i < this.equipoPartido.length; i++) {
            if (this.equipoPartido[i] == null) {
                this.equipoPartido[i] = equipoPartido;
            }
        }


    }

    //Leer
    public String getPartido(){
        return "Fecha de partido: "+this.getFechaPartido() + "\nHORA: "+ this.getHoraPartido()
                +"\nARBITRO: "+ this.getArbitroPartido().getNombre() + " "
                + this.getArbitroPartido().getApellido() +"\nPARTIDO: "+ this.getEquipoPartido();
    }

    public static ArrayList<Partido> getListaPartido(){
        return ListaPartido;
    }
    public static void setUnaListaPartido(ArrayList<Partido> listasPartido) {
        ListaPartido = listasPartido;
    }
    public static void setListaPartido(Partido listaPartido) {
        ListaPartido.add(listaPartido);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalTime getHoraPartido() {
        return horaPartido;
    }

    public void setHoraPartido(LocalTime horaPartido) {
        this.horaPartido = horaPartido;
    }
}
