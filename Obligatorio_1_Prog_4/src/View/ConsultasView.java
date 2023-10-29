package View;

import Controller.*;
import Model.Jugador;
import Model.Partido;

import java.util.Scanner;

public class ConsultasView {
    public static void listadoJugadores(){
        while (true) {
            if(JugadorController.noHayJugador()){
                break;
            }
            JugadorController.leerConsulta();
            System.out.println("Desea regresar? (1:no|0:si)");
            Scanner s = new Scanner(System.in);
            int salir = s.nextInt();
            if (salir == 0) {
                break;
            }
        }
    }
    public static void jugadoresXEquipo() {
        int id;
        while (true) {
            if(JugadorController.noHayJugador()){
                break;
            }else if(EquipoController.noHayEquipo()){
                break;
            }
            try {
                System.out.println("Eleguir equipo:");
                EquipoController.leer();
                Scanner a = new Scanner(System.in);
                id = a.nextInt();
                System.out.println("Jugadores que conforman el equipo");
                EquipoController.leerJugador(EquipoController.Encontrar(id));
                EquipoController.leerSuplentes(EquipoController.Encontrar(id));
                System.out.println("Desea regresar? (1:no|0:si)");
                Scanner s = new Scanner(System.in);
                int salir = s.nextInt();
                if (salir == 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Comando no conocido" + e);
            }
        }
    }
    public static void sueldoTotalJugador(){
        while (true) {
            if(JugadorController.noHayJugador()){
                break;
            }
            ConsultasController.calculoSueldoJugador();
            System.out.println("Desea regresar? (1:no|0:si)");
            Scanner s = new Scanner(System.in);
            int salir = s.nextInt();
            if (salir == 0) {
                break;
            }
        }
    }
    public static void sueldoTotalArbitro(){
        while (true) {
            if(ArbitroController.noHayArbitro()){
                break;
            }
            ConsultasController.calculoSueldoArbitro();
            System.out.println("Desea regresar? (1:no|0:si)");
            Scanner s = new Scanner(System.in);
            int salir = s.nextInt();
            if (salir == 0) {
                break;
            }
        }
    }
    public static void sueldoTotalTecnico(){
        while (true) {
            if(TecnicoController.noHayTecnico()){
                break;
            }
            ConsultasController.calculoSueldoTecnico();
            System.out.println("Desea regresar? (1:no|0:si)");
            Scanner s = new Scanner(System.in);
            int salir = s.nextInt();
            if (salir == 0) {
                break;
            }
        }
    }

    public static void arbitroXPartido(){
        int id;
        while (true) {
            if(ArbitroController.noHayArbitro()){
                break;
            } else if (PartidoController.noHayPartido()) {
                break;
            }
            try {
                System.out.println("Eleguir un partido:");
                PartidoController.leer();
                Scanner a = new Scanner(System.in);
                id = a.nextInt();
                System.out.println("Arbitro del partido");
                System.out.println(PartidoController.Encontrar(id).getArbitroPartido().getNombre());
                System.out.println("Desea regresar? (1:no|0:si)");
                Scanner s = new Scanner(System.in);
                int salir = s.nextInt();
                if (salir == 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Comando desconocido" + e);
            }
        }
    }
    public static void verTodosLosPartidos(){
        while (true) {
            if(PartidoController.noHayPartido()){
                break;
            }
            PartidoViewCRUD.LeerView();
            System.out.println("Desea regresar? (1:no|0:si)");
            Scanner s = new Scanner(System.in);
            int salir = s.nextInt();
            if (salir == 0) {
                break;
            }
        }
    }
    public static void precalentamiento(){
        while (true) {
            System.out.println("Los jugadores deben precalentar durante 15 minutos" + "\nLos técnicos no realizan precalentamiento" + "\nLos árbitros deben precalentar durante 10 minutos");
            System.out.println("Desea regresar? (1:no|0:si)");
            Scanner s = new Scanner(System.in);
            int salir = s.nextInt();
            if (salir == 0) {
                break;
            }
        }
    }

}
