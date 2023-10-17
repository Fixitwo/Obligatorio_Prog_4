package Model;

import java.time.LocalTime;
import java.util.ArrayList;

public class Partido {
    private Arbitro arbitroPartido;
    private LocalTime fechaPartido;
    private static ArrayList<Partido> ListaPartido = new ArrayList<>();
    private Equipo[] equipoPartido = new Equipo[2];

    //Constructor
    public Partido(Arbitro arbitro, LocalTime fechaPartido, Equipo equipo){
        this.arbitroPartido=arbitro;
        this.fechaPartido=fechaPartido;
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
    public LocalTime getFechaPartido() {
        return fechaPartido;
    }
    public void setFechaPartido(LocalTime fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    //Equipos
    public Equipo[] getEquipoPartido() {
        return equipoPartido;
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
        return "Fecha de partido: "+this.getFechaPartido() +"\nARBITRO: "+ this.getArbitroPartido() +"\nPARTIDO: "+ this.getEquipoPartido();
    }

}
