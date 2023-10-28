package View;

import Controller.ConsultasController;
import Controller.EquipoController;
import Controller.JugadorController;
import Controller.PartidoController;
import Model.Jugador;
import Model.Partido;

import java.util.Scanner;

public class ConsultasView {
    public static void listadoJugadores(){
        JugadorController.leerConsulta();
    }
    public static void jugadoresXEquipo() {
        int id;
        try {
            System.out.println("Eleguir equipo:");
            EquipoController.leer();
            Scanner a = new Scanner(System.in);
            id=a.nextInt();
            System.out.println("Jugadores que conforman el equipo");
            EquipoController.leerJugador(EquipoController.Encontrar(id));
            EquipoController.leerSuplentes(EquipoController.Encontrar(id));
        }catch (Exception e){
            System.out.println("Comando no conocido" + e);
        }
    }
    public static void sueldoTotalJugador(){

        ConsultasController.calculoSueldoJugador();
    }
    public static void sueldoTotalArbitro(){
        ConsultasController.calculoSueldoArbitro();
    }
    public static void sueldoTotalTecnico(){
        ConsultasController.calculoSueldoTecnico();
    }

    public static void arbitroXPartido(){
        int id;
        try {
            System.out.println("Eleguir un partido:");
            PartidoController.leer();
            Scanner a = new Scanner(System.in);
            id=a.nextInt();
            System.out.println("Partidos a disputar");
            System.out.println(PartidoController.Encontrar(id).getArbitroPartido().getNombre());
        }catch (Exception e){
            System.out.println("Comando desconocido"+ e);
        }
    }
    public static void verTodosLosPartidos(){
        PartidoViewCRUD.LeerView();
    }
    public static void precalentamiento(){
        System.out.println("Los jugadores deben precalentar durante 15 minutos" + "\nLos técnicos no realizan precalentamiento" + "\nLos árbitros deben precalentar durante 10 minutos");
    }

}
