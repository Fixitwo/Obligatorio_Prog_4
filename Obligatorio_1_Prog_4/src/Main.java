import Controller.ArbitroController;
import View.ArbitroViewCRUD;
import View.EquipoViewCRUD;
import View.JugadorViewCRUD;

import java.time.LocalTime;
import java.util.*;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Bienvenido al gestionador de partidos de futbol 5!!!!!");
            System.out.println("Donde desea entrar?");
            System.out.println("0: CRUD Jugador");
            System.out.println("1: CRUD Equipo");
            System.out.println("2: CRUD Arbitro");
            System.out.println("3: CRUD Partido");
            System.out.println("4: CRUD Tecnico");
            System.out.println("5: Otros");
            System.out.println("6: Salir");
            try {
                int siguiente = s.nextInt();
                if(siguiente == 0){
                    JugadorCRUD();
                }
                if(siguiente == 1){
                    EquipoCRUD();
                }
                if(siguiente == 2){
                    ArbitroCRUD();
                }
                if(siguiente == 3){
                    System.out.println("No disponible por ahora ");
                }
                if(siguiente == 4){
                    System.out.println("No disponible por ahora ");
                }
                if(siguiente == 5){
                    System.out.println("No disponible por ahora ");
                }
                if(siguiente == 6){
                    break;
                }

            }catch (Exception e){

            }
        }

        //Ejemplo de como dar de alta fecha y hora
        /*
        //ingresar fecha
        System.out.println("Dia:");
        Scanner a = new Scanner(System.in);
        String dia = a.nextLine();

        System.out.println("Mes:");
        Scanner c = new Scanner(System.in);
        String mes = c.nextLine();

        System.out.println("Anio:");
        Scanner e = new Scanner(System.in);
        String anio = e.nextLine();

        LocalDate date = LocalDate.parse(anio+"-"+mes+"-"+dia);

        consoleClear();
        System.out.println("Fecha "+ date);

        //ingresar hora
        LocalTime ltObject3 = LocalTime.parse("08:20");
        System.out.println("ltObject3 = " + ltObject3);
        */
    }
    public static void ArbitroCRUD(){
        Scanner s = new Scanner(System.in);
        int siguiente;

        while (true){
            System.out.println("Que desea realizar? ");
            try{
                System.out.println("0: Alta Arbitro");
                System.out.println("1: Baja Arbitro");
                System.out.println("2: Modificar Arbitro");
                System.out.println("3: Ver todos los Arbitros");
                System.out.println("4: Salir al menu");
                siguiente = s.nextInt();
                if(siguiente == 0){
                    ArbitroViewCRUD.AltaView();
                }
                if(siguiente == 1){
                    ArbitroViewCRUD.BajaView();
                }
                if(siguiente == 2){
                    ArbitroViewCRUD.ModificarView();
                }
                if(siguiente == 3){
                    ArbitroViewCRUD.LeerView();
                }
                if(siguiente == 4){
                    break;
                }



            }catch (Exception e){
                System.out.println("Comando desconocido ");
            }
        }
    }
    public static void EquipoCRUD(){
        Scanner s = new Scanner(System.in);
        int siguiente;

        while (true){
            System.out.println("Que desea realizar? ");
            try{
                System.out.println("0: Alta Equipo");
                System.out.println("1: Baja Equipo");
                System.out.println("2: Modificar Equipo");
                System.out.println("3: Ver todos los Equipos");
                System.out.println("4: Salir al menu");
                siguiente = s.nextInt();
                if(siguiente == 0){
                    EquipoViewCRUD.AltaView();
                }
                if(siguiente == 1){
                    EquipoViewCRUD.BajaView();
                }
                if(siguiente == 2){
                    EquipoViewCRUD.ModificarView();
                }
                if(siguiente == 3){
                    EquipoViewCRUD.LeerView();
                }
                if(siguiente == 4){
                    break;
                }



            }catch (Exception e){
                System.out.println("Comando desconocido ");
            }
        }
    }
    public static void JugadorCRUD(){
        Scanner s = new Scanner(System.in);
        int siguiente;

        while (true){
            System.out.println("Que desea realizar? ");
            try{
                System.out.println("0: Alta Jugador");
                System.out.println("1: Baja Jugador");
                System.out.println("2: Modificar Jugador");
                System.out.println("3: Ver todos los Jugadores");
                System.out.println("4: Salir al menu");
                siguiente = s.nextInt();
                if(siguiente == 0){
                    JugadorViewCRUD.AltaView();
                }
                if(siguiente == 1){
                    JugadorViewCRUD.BajaView();
                }
                if(siguiente == 2){
                    JugadorViewCRUD.ModificarView();
                }
                if(siguiente == 3){
                    JugadorViewCRUD.LeerView();
                }
                if(siguiente == 4){
                    break;
                }



            }catch (Exception e){
                System.out.println("Comando desconocido ");
            }
        }
    }
}