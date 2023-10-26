package View;

import Controller.EquipoController;
import Controller.JugadorController;

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
}
