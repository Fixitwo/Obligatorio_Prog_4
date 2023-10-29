import Controller.ArbitroController;
import Controller.EquipoController;
import Controller.JugadorController;
import Model.Arbitro;
import Model.Partido;
import Model.Tecnico;
import View.*;

import java.time.LocalTime;
import java.util.*;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true){
            MenuView.consoleClear();
            System.out.println("Bienvenido al gestionador de partidos de futbol 5!!!!!");
            System.out.println("Donde desea entrar?");
            System.out.println("0: CRUD Jugador");
            System.out.println("1: CRUD Equipo");
            System.out.println("2: CRUD Tecnico");
            System.out.println("3: CRUD Arbitro");
            System.out.println("4: CRUD Partido");
            System.out.println("5: Consultas");
            System.out.println("6 o letra: Salir");
            try {
                int siguiente = s.nextInt();
                switch (siguiente){
                    case 0 -> JugadorCRUD();
                    case 1 -> EquipoCRUD();
                    case 2 -> TecnicoCRUD();
                    case 3 -> ArbitroCRUD();
                    case 4 -> PartidoCRUD();
                    case 5 -> Consultas();
                    default -> System.out.println("Comando desconocido");
                }
                if(siguiente==6){
                    break;
                }

            }catch (Exception e){
                System.out.println("Finalizando programa");
                break;
            }
        }

    }
    public static void ArbitroCRUD(){
        Scanner s = new Scanner(System.in);
        int siguiente;

        while (true){
            MenuView.consoleClear();
            System.out.println("Que desea realizar? ");
            try{
                System.out.println("0: Alta Arbitro");
                System.out.println("1: Baja Arbitro");
                System.out.println("2: Modificar Arbitro");
                System.out.println("3: Ver todos los Arbitros");
                System.out.println("4 o letra: Salir al menu");
                siguiente = s.nextInt();

                switch (siguiente){
                    case 0 ->  ArbitroViewCRUD.AltaView();
                    case 1 -> ArbitroViewCRUD.BajaView();
                    case 2 -> ArbitroViewCRUD.ModificarView();
                    case 3 -> ArbitroViewCRUD.LeerView();
                    default -> System.out.println("Comando desconocido");
                }
                if(siguiente==4){
                    break;
                }
            }catch (Exception e){
                System.out.println("Regresando ");
                break;
            }
        }
    }
    public static void EquipoCRUD(){
        Scanner s = new Scanner(System.in);
        int siguiente;

        while (true){
            MenuView.consoleClear();
            if(JugadorController.noHayJugador()){
                System.out.println("No hay jugadores para crear un equipo ");
            }
            System.out.println("Que desea realizar? ");
            try{
                System.out.println("0: Alta Equipo");
                System.out.println("1: Baja Equipo");
                System.out.println("2: Modificar Equipo");
                System.out.println("3: Ver todos los Equipos");
                System.out.println("4 o letra: Salir al menu");
                siguiente = s.nextInt();

                switch (siguiente){
                    case 0 -> EquipoViewCRUD.AltaView();
                    case 1 -> EquipoViewCRUD.BajaView();
                    case 2 -> EquipoViewCRUD.ModificarView();
                    case 3 -> EquipoViewCRUD.LeerView();
                    default -> System.out.println("Comando desconocido");
                }
                if(siguiente==4){
                    break;
                }

            }catch (Exception e){
                System.out.println("Regresando ");
                break;
            }
        }
    }
    public static void JugadorCRUD(){
        Scanner s = new Scanner(System.in);
        int siguiente;

        while (true){
            MenuView.consoleClear();
            System.out.println("Que desea realizar? ");
            try{
                System.out.println("0: Alta Jugador");
                System.out.println("1: Baja Jugador");
                System.out.println("2: Modificar Jugador");
                System.out.println("3: Ver todos los Jugadores");
                System.out.println("4 o letra: Salir al menu");
                siguiente = s.nextInt();

                switch (siguiente){
                    case 0 -> JugadorViewCRUD.AltaView();
                    case 1 -> JugadorViewCRUD.BajaView();
                    case 2 -> JugadorViewCRUD.ModificarView();
                    case 3 -> JugadorViewCRUD.LeerView();
                    default -> System.out.println("Comando desconocido");
                }
                if(siguiente==4){
                    break;
                }

            }catch (Exception e){
                System.out.println("Regresando ");
                break;
            }
        }

    }
    public static void PartidoCRUD() {
        Scanner s = new Scanner(System.in);
        int siguiente;

        while (true) {
            MenuView.consoleClear();
            if(EquipoController.noHayEquipo()){
                System.out.println("No se pueden crear partidos porque no hay suficientes equipos ");
            }else if(ArbitroController.noHayArbitro()){
                System.out.println("No se pueden crear partidos porque no hay Arbitros ");
            }
            System.out.println("Que desea realizar? ");
            try {
                System.out.println("0: Alta Partido");
                System.out.println("1: Baja Partido");
                System.out.println("2: Modificar Partido");
                System.out.println("3: Ver todos los Partidos");
                System.out.println("4 o letra: Salir al menu");
                siguiente = s.nextInt();

                switch (siguiente){
                    case 0 -> PartidoViewCRUD.AltaView();
                    case 1 -> PartidoViewCRUD.BajaView();
                    case 2 -> PartidoViewCRUD.ModificarView();
                    case 3 -> PartidoViewCRUD.LeerView();
                    default -> System.out.println("Comando desconocido");
                }
                if(siguiente==4){
                    break;
                }

            } catch (Exception e) {
                System.out.println("Regresando ");
                break;
            }
        }
    }
    public static void TecnicoCRUD() {
        Scanner s = new Scanner(System.in);
        int siguiente;

        while (true) {
            MenuView.consoleClear();
            System.out.println("Que desea realizar? ");
            try {
                System.out.println("0: Alta Tecnico");
                System.out.println("1: Baja Tecnico");
                System.out.println("2: Modificar Tecnico");
                System.out.println("3: Ver todos los Tecnico");
                System.out.println("4 o letra: Salir al menu");
                siguiente = s.nextInt();

                switch (siguiente){
                    case 0 -> TecnicoViewCRUD.AltaView();
                    case 1 -> TecnicoViewCRUD.BajaView();
                    case 2 -> TecnicoViewCRUD.ModificarView();
                    case 3 -> TecnicoViewCRUD.LeerView();
                    default -> System.out.println("Comando desconocido");
                }
                if(siguiente==4){
                    break;
                }

            } catch (Exception e) {
                System.out.println("Regresando ");
                break;
            }
        }
    }
    public static void Consultas() {
        Scanner s = new Scanner(System.in);
        int siguiente;

        while (true) {
            MenuView.consoleClear();
            System.out.println("Que desea realizar? ");
            try {
                System.out.println("0: Ver todos los jugadores");
                System.out.println("1: Ver todos los jugadores de un equipo");
                System.out.println("2: Ver sueldo con prima de los jugadores");
                System.out.println("3: Ver sueldo con prima de los arbitros");
                System.out.println("4: Ver sueldo con prima de los tecnicos");
                System.out.println("5: Mostrar arbitro de un partido");
                System.out.println("6: Ver Partidos");
                System.out.println("7: Precalentamiento");
                System.out.println("8 o letra: Salir al menu");
                siguiente = s.nextInt();

                switch (siguiente){
                    case 0 -> ConsultasView.listadoJugadores();
                    case 1 -> ConsultasView.jugadoresXEquipo();
                    case 2 -> ConsultasView.sueldoTotalJugador();
                    case 3 -> ConsultasView.sueldoTotalArbitro();
                    case 4 -> ConsultasView.sueldoTotalTecnico();
                    case 5 -> ConsultasView.arbitroXPartido();
                    case 6 -> ConsultasView.verTodosLosPartidos();
                    case 7 -> ConsultasView.precalentamiento();
                    default -> System.out.println("Comando desconocido");
                }
                if(siguiente==8){
                    break;
                }

            } catch (Exception e) {
                System.out.println("Regresando ");
                break;
            }
        }
    }
}
